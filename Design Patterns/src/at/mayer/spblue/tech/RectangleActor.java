package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor implements Actor{
    private MoveStrategy moveStrategy;
    public RectangleActor(MoveStrategy mr) {
        super();
        this.moveStrategy = mr;
    }

    public void update(GameContainer gc, int delta){
        moveStrategy.update(delta);
    }
    public void render(Graphics graphics){
        graphics.drawRect(this.moveStrategy.getX(),this.moveStrategy.getY(),20,20);
    }
}
