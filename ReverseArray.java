public class ReverseArray{
    public static void reverseArray(int arr[]){
        int size = arr.length;
        for(int i = 0 ; i < size/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
    }

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};
        reverseArray(arr);
        System.out.println("Reverse Array : ");
        for(int i = 0 ; i <= arr.length-1 ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}