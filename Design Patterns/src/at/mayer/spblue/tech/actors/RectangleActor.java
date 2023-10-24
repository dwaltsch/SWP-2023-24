package at.mayer.spblue.tech.actors;

import at.mayer.spblue.tech.actors.AbstractActor;
import at.mayer.spblue.tech.observer.Oberserver;
import at.mayer.spblue.tech.strategy.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class RectangleActor extends AbstractActor implements Oberserver {
    private Color color;
    public RectangleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
        this.color = Color.white;
    }
    @Override
    public void render(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.moveStrategy.getX(),this.moveStrategy.getY(),20,20);
        g.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = Color.pink;
    }
}
