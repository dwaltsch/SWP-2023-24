package at.mayer.spblue.tech.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    void update(GameContainer gc, int delta);
    void render(Graphics graphics);
}
