package mayer.local.sort;

public class Sorter {
    Algo algo;

    public void setAlgo(Algo algo){
        this.algo = algo;
    }
    public int[] sort(int[] data){
        return algo.doSort(data);
    }
}