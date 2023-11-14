package spblue.tech.haussteuerung;

public class Markiesenregler implements Observer {
    public Markiesenregler() {
    }

    @Override
    public void inform() {
        System.out.println("Markiese Info erhalten");
    }
}
