package algorithms;

public class SelectionSort {
    private Metrics metrics = new Metrics();

    public Metrics sort(int[] arr) {
        metrics.reset();
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            boolean swapped = false;

            for (int j = i + 1; j < arr.length; j++) {
                metrics.incrementComparisons();
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(arr, i, minIndex);
                swapped = true;
                metrics.incrementSwaps();
            }

            if (!swapped) break;
        }

        long endTime = System.nanoTime();
        metrics.setTime(endTime - startTime);
        return metrics;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
