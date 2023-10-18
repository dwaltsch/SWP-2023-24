package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Homer implements Actor{
    @Override
    public void update(GameContainer gameContainer,int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawString("I am Homer",300,200);
    }
}
