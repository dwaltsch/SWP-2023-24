package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void update(GameContainer gc,int delta);
    public void render(Graphics graphics);
}
