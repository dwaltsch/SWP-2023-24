package at.mayer.spblue.tech;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private List<CircleActor> circles;
    private RectangleActor rec;
    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (CircleActor ca: this.circles) {
            ca.render(graphics);
        }
        this.rec.render(graphics);
    }
    @Override
    public void init(GameContainer gc) throws SlickException {
        this.circles = new ArrayList<>();
        this.circles.add(new CircleActor(75,75));
        this.circles.add(new CircleActor(100,100));
        this.rec = new RectangleActor(50,50);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (CircleActor ca: this.circles) {
            ca.update(gc,delta);
        }
        this.rec.update(gc,delta);
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