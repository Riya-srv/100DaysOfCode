public class Sort012 {
    public static void sort012(int arr[]){
        int n = arr.length;
        int l = 0;
        int mid = 0;
        int r = n-1;

        while(mid <= r){

            if(arr[mid] == 0){
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[r];
                arr[r] = arr[mid];
                arr[mid] = temp;
                r--;
            }
        }
    }

    public static void main(String args[]){

        int arr[] = {0,2,1,2,0};
        sort012(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
