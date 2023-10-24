package at.mayer.spblue.tech.actors;

import at.mayer.spblue.tech.observer.Oberserver;
import at.mayer.spblue.tech.strategy.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Observer extends AbstractActor implements Oberserver {
    Color color;
    public Observer(MoveStrategy moveStrategy) {
        super(moveStrategy);
        this.color = Color.yellow;
    }

    public void render(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.moveStrategy.getX(),this.moveStrategy.getY(),10,10);
        g.setColor(Color.white);
    }
    public void inform(){
        this.color = Color.blue;
    }
}
