public class SortingDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 7};

        Sorter bubbleSorter = new Sorter(new BubbleSort());
        System.out.println("Using Bubble Sort:");
        bubbleSorter.performSort(numbers);

        Sorter selectionSorter = new Sorter(new SelectionSort());
        System.out.println("Using Selection Sort:");
        selectionSorter.performSort(numbers);
    }
}
