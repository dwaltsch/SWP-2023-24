package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor extends AbstractActor{

    public RectangleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }
    @Override
    public void render(Graphics g){
        g.drawRect(this.moveStrategy.getX(),this.moveStrategy.getY(),20,20);
    }

}
