package mayer.local.sort;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Algo bubble = new BubbleSort();
        sorter.setAlgo(bubble);
        DataGenerator.printArray(sorter.sort(DataGenerator.generateDataArray(5)));
    }
}
