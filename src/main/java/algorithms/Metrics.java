package algorithms;

public class Metrics {
    private long comparisons;
    private long swaps;
    private long time;

    public void reset() {
        comparisons = 0;
        swaps = 0;
        time = 0;
    }

    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementSwaps() {
        swaps++;
    }

    public void setTime(long t) {
        time = t;
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Comparisons: " + comparisons +
                ", Swaps: " + swaps +
                ", Time(ns): " + time;
    }
}
