public class BinarySearch {
    public static int binarySearch(int arr[], int k){
        int first = 0;
        int last = arr.length - 1;
        
        while(first <= last){
            int mid = first + (last - first)/2;
            if(arr[mid] == k){
                return mid;
            }

            else if(k < arr[mid]){
                last = mid - 1;
            }
            else{
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,5,8,9,11,15,17};

        System.out.println("k is found at : " + binarySearch(arr, 8));
    }
}
