package at.mayer.spblue.tech.actors;

import at.mayer.spblue.tech.observer.Oberserver;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

import java.util.ArrayList;
import java.util.List;

public class Player implements Actor {
    private float x;
    private final float y;
    private final float speed;
    private final List<Oberserver> circles;

    public Player() {
        this.circles = new ArrayList<>();
        this.x = 300;
        this.y = 300;
        this.speed = 1f;
    }
    public void addObserver(Oberserver obs){
        this.circles.add(obs);
    }
    public void move(GameContainer gc,int delta){
        if(gc.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= (float)delta * speed;
            System.out.println("left: x" + this.x);
        }
        if(gc.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += delta * speed;
        }
        if(this.x > 700){
            for(Oberserver circ: circles){
                circ.inform();
            }
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
