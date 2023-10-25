package at.mayer.spblue.tech;

import at.mayer.spblue.tech.actors.Actor;
import at.mayer.spblue.tech.actors.Circle;
import at.mayer.spblue.tech.actors.Player;
import at.mayer.spblue.tech.actors.RectangleActor;
import at.mayer.spblue.tech.factory.RandomCircleFactory;
import at.mayer.spblue.tech.strategy.MoveLeft;
import at.mayer.spblue.tech.strategy.MoveRight;
import at.mayer.spblue.tech.strategy.MoveStrategy;
import org.newdawn.slick.*;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;
    Player player;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor act: this.actors) {
            act.render(graphics);
        }
    }
    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        this.player = new Player();
        MoveStrategy moveStrategy1 = new MoveRight(100,100,0.01f);
        MoveStrategy moveStrategy2 = new MoveLeft(300,50,0.01f);
        MoveStrategy moveStrategy3 = new MoveLeft(50,300,0.01f);
        for (int i = 0; i < 10; i++) {
            this.actors.add(RandomCircleFactory.getRandomActor(moveStrategy3));
        }
        Circle c1 = new Circle(moveStrategy1);
        this.actors.add(c1);
        Circle c2 = new Circle(moveStrategy2);
        this.actors.add(c2);
        RectangleActor rec1 = new RectangleActor(moveStrategy2);
        this.actors.add(rec1);
        this.actors.add(this.player);
        this.player.addObserver(rec1);
        this.player.addObserver(c1);
        this.player.addObserver(c2);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor act: this.actors) {
            act.update(gc,delta);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("test"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}