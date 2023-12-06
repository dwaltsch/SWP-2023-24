package mayer.local.sort;

public class SelectSort implements Algo {
    @Override
    public int[] doSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int store = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[store]) {
                    store = j;
                }
            }
            int temp = input[store];
            input[store] = input[i];
            input[i] = temp;
        }
        return input;
    }

}
