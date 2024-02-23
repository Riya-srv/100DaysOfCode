public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 34, 25, 12, 28, 11, 80};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
