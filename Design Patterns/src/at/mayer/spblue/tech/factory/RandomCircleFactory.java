package at.mayer.spblue.tech.factory;

import at.mayer.spblue.tech.actors.Actor;
import at.mayer.spblue.tech.actors.Circle;
import at.mayer.spblue.tech.actors.RectangleActor;
import at.mayer.spblue.tech.strategy.MoveLeft;
import at.mayer.spblue.tech.strategy.MoveRight;
import at.mayer.spblue.tech.strategy.MoveStrategy;

import java.util.Random;

public class RandomCircleFactory {
    public static Actor getRandomActor(MoveStrategy moveStrategy){
        Random random = new Random();
        int number = random.nextInt(2);
        if (number == 0){
            return new Circle(moveStrategy);
        }
        return new RectangleActor(moveStrategy);
    }
}
