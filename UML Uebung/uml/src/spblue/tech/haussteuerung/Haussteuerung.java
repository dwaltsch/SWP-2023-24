package spblue.tech.haussteuerung;

import java.util.ArrayList;
import java.util.List;

public class Haussteuerung {
    private List<Observer> observers;
    private Thermo thermo1 = new Thermo(15);
    private Markiesenregler markiesenregler = new Markiesenregler();
    private Heizregler heizregler = new Heizregler();
    public void runHaus() {
        this.observers = new ArrayList<>();
        this.observers.add(markiesenregler);
        this.observers.add(heizregler);
        thermo1.setTemp(25);
        if (thermo1.getTemp() > 20) {
            for (Observer observer : this.observers) {
                observer.inform();
            }
        }
    }

    public static void main(String[] argv) {
        Haussteuerung haus = new Haussteuerung();
        haus.runHaus();
    }
}

