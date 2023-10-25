package at.mayer.spblue.tech.strategy;

public interface MoveStrategy {
    float getX();
    float getY();
    void update(int delta);
}
