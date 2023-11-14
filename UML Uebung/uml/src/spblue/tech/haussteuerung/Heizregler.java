package spblue.tech.haussteuerung;

public class Heizregler implements Observer {
    public Heizregler() {
    }

    @Override
    public void inform() {
        System.out.println("Heizregler Info erhalten");
    }
}
