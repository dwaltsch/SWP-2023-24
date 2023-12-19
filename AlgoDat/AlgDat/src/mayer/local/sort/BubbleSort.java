package mayer.local.sort;

public class BubbleSort implements Algo{
    @Override
    public int[] doSort(int[] input) {
        boolean swap = false;
        for (int y = 0; y < input.length - 1; y++) {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int store = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = store;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return input;
    }
}
