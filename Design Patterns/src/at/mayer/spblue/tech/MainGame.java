package at.mayer.spblue.tech;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private CircleActor cal;
    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.cal = new CircleActor(100,100);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {

    }
    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
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