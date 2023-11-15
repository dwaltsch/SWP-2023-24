package spblue.tech.Factory;

public class User {
    public static void main(String[] args) {
        Algo algo = Algofactory.getAlgo(false);
        algo.encrypt();
    }
}
