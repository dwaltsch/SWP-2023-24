package mayer.local.sort;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size){
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(20);
        }
        return data;
    }
    public static int[] generateDataArray(int size, int min, int max){
        return new int[0];
    }
    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
