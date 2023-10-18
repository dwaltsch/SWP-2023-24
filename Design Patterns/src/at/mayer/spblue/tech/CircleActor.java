package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{
    private MoveRight mr;

    public CircleActor(MoveRight mr) {
        super();
        this.mr = mr;

    }

    public void update(GameContainer gc, int delta){
        mr.update(delta);
    }
    public void render(Graphics graphics){
        graphics.drawOval(this.mr.getX(),this.mr.getY(),20,20);
    }
}
