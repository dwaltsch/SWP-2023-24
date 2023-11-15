package spblue.tech.Factory;

public class Algofactory {
    public static Algo getAlgo(boolean yes){
        if(yes){
            return new MacAlgo();
        }
        return new WinAlgo();
    }
}
