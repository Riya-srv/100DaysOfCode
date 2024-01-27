public class MaxMin {
    public static void maximini(int arr[]){
        int n = arr.length;
        int max, min;
        if(n==1){
            max = arr[0];
            min = arr[0];
        }else{
            if(arr[0] < arr[1]){
                min = arr[0];
                max = arr[1];

            }
            else{
                min = arr[1];
                max = arr[0];
            }
        }

        for(int i = 2 ; i < n ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }

    public static void main(String args[]){
        int arr[] = {5,9,2,4,3};

        maximini(arr);
    }
}
