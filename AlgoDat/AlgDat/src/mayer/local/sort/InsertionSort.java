package mayer.local.sort;

public class InsertionSort implements Algo{
    @Override
    public int[] doSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int store = input[i];
            int j = i - 1;
            while(j >= 0 && input[j] > store){
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = store;
            }
        return input;
    }
}