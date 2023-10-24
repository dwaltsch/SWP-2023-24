package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player implements Actor{
    private float x,y,speed;

    public Player() {
        this.x = 300;
        this.y = 300;
        this.speed = 1f;
    }
    public void move(GameContainer gc,int delta){
        if(gc.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= (float)delta * speed;
            System.out.println("left: x" + this.x);
        }
        if(gc.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += delta * speed;
        }
    }

    public void draw(Graphics g){
        g.fillRect(this.x,this.y,50,50);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        move(gc,delta);
    }

    @Override
    public void render(Graphics graphics) {
        draw(graphics);
    }
}
