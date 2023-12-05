package mayer.local.sort;

public class BubbleSort implements Algo{
    @Override
    public int[] doSort(int[] input) {
        for (int y = 0; y < input.length; y++) {
            for (int i = 0; i < input.length - 1; i++) {
                if(input[i] > input[i+1]){
                    int zwischenspeicher = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = zwischenspeicher;
                }
            }
        }
        return input;
    }
}
