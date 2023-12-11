import java.util.Arrays;
class Sorter {
    private SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        int[] sortedArray = sortingStrategy.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}