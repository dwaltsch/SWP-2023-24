package at.mayer.spblue.tech;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private CircleActor cal,cal2;
    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        this.cal.render(graphics);
        this.cal2.render(graphics);
    }
    @Override
    public void init(GameContainer gc) throws SlickException {
        this.cal = new CircleActor(100,100);
        this.cal2 = new CircleActor(100,100);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        this.cal.update(gc,delta);
        this.cal2.update(gc,delta);
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