package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor {
    private double x,y;
    public void update(GameContainer gc,int delta){

    }
    public void render(Graphics graphics){
        graphics.drawOval((float)this.x,(float)this.y,20,20);
    }
}
