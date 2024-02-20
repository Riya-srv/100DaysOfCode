public class QuickSort {
    public static int getPartitionIndex(int arr[] , int low , int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(i <= high-1 && arr[i] <= pivot){
                i++;
            }
            while(j >= low+1 && arr[j] >= pivot){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;
        return j;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low<high){
        int pIndex = getPartitionIndex(arr, low, high);
        quickSort(arr, low, pIndex-1);
        quickSort(arr, pIndex+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 5, 7, 2, 10, 6};

        quickSort(arr, 0, arr.length-1);
        System.out.print("Sorted array : ");
        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
