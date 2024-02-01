public class CyclicRotate {
    public static void cyclicRotate(int arr[]){
        int n = arr.length;
        int last = arr[n-1];

        for(int i = n-1 ; i > 0 ; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = last;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        cyclicRotate(arr);
        System.out.print("Cyclic Rotated array : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
