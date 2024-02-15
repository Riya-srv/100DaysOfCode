public class FirstLastPos {

    public static int[] findFirstLastOccurrences(int[] arr, int x) {
        int leftIndex = binarySearchLeft(arr, x);
        int rightIndex = binarySearchRight(arr, x);

        if (leftIndex <= rightIndex) {
            return new int[]{leftIndex, rightIndex};
        } else {
            return new int[]{-1, -1};
        }
    }

    private static int binarySearchLeft(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int binarySearchRight(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int x = 3;
        int[] result = findFirstLastOccurrences(arr, x);
        System.out.println(result[0] + " " + result[1]); 
    }
}
