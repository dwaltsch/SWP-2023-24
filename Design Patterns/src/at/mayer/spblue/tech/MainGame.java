package at.mayer.spblue.tech;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;

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
        MoveRight mr1 = new MoveRight(10,10,0.4f);
        MoveRight mr2 = new MoveRight(10,10,0.5f);
        this.actors.add(new CircleActor(mr1));
        this.actors.add(new CircleActor(mr2));
        this.actors.add(new RectangleActor(50,50));
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