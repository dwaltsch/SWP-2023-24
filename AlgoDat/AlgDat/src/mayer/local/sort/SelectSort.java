package mayer.local.sort;

public class SelectSort implements Algo {
    @Override
    public int[] doSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int store = input[i];
            for (int j = i; j < input.length - i; j++) {
                if(input[j] < store){
                    store = input[j];
                }
            }
            input[i] = store;
        }
        return input;
    }

}
