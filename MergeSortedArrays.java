public class MergeSortedArrays {

    public static void swapIfGreater(int arr1[], int arr2[], int idx1, int idx2){
        if(arr1[idx1] > arr2[idx2]){
            int temp = arr1[idx1];
            arr1[idx1] = arr2[idx2];
            arr2[idx2] = temp;
        }
    }

    public static void mergeTwoSortedArrays(int arr1[], int arr2[], int n, int m)
    {
        int len = n+m;
        int gap = (len/2) + (len%2) ; //to take ceiling value
        while(gap > 0){
            int left = 0;
            int right = left + gap;
            while(right < len){
                //arr1 and arr2
                if(left < n && right >= n){
                    swapIfGreater(arr1, arr2, left, right-n);
                }
                //arr2 and arr2
                else if(left >= n){
                    swapIfGreater(arr2, arr2, left-n, right-n);
                }
                //arr1 and arr1
                else{
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++; right++;
            }
            if(gap<=1) break;
            else gap = (gap/2) + (gap%2);
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
        mergeTwoSortedArrays(arr1, arr2, n, m);
        printArray(arr1);
        printArray(arr2);
    }
}
