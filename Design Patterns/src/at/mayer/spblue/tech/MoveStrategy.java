package at.mayer.spblue.tech;

public interface MoveStrategy {
    public float getX();
    public float getY();
    public void update(int delta);
}
