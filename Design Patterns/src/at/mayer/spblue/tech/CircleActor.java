package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor{
    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    public void render(Graphics g){
        g.drawOval(this.moveStrategy.getX(),this.moveStrategy.getY(),10,10);
    }
}
