public class DuplicatesInAnArray {
    public static int getDuplicates(int arr[]){

        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);

        slow = arr[0];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return fast;
    }

    public static void main(String args[]){
        int arr[] = {2,1,2,3,4};

        System.out.println("Duplicate in an array is : " + getDuplicates(arr));
     }
}
