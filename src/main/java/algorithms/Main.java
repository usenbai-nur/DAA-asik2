package algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4};

        SelectionSort sorter = new SelectionSort();
        Metrics metrics = sorter.sort(arr);

        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println(metrics);
    }
}
