package algorithms;

import java.util.Random;
import java.util.Arrays;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 5000, 10000};

        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            SelectionSort sorter = new SelectionSort();
            Metrics metrics = sorter.sort(arr);

            System.out.println("Array size: " + size);
            System.out.println(metrics);
            System.out.println("--------------------------------");
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }
}
