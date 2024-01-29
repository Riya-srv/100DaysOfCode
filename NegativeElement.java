public class NegativeElement {
    public static void negativeElemenetSorting(int arr[]){

        int j=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String args[]){

        int arr[] = {5, 2, -8, 9, -1, -13, -12};

        negativeElemenetSorting(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
