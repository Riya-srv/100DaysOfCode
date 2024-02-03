import java.util.Arrays;

public class MinimiseHeight {
    public static int minimiseHeightDifference(int arr[] , int k){
        int n = arr.length;
        
        Arrays.sort(arr);

        int diff = arr[n-1] - arr[0];

        for(int i = 1 ; i < n ; i++){

            if(arr[i] - k < 0) continue;
            int maxHeight = Math.max(arr[n-1]-k , arr[i-1]+k);
            int minHeight = Math.min(arr[0]+k , arr[i]-k);

            diff = Math.min(diff , maxHeight - minHeight);
        }
        return diff;
    }

    public static void main(String args[]){
        int arr[] = {1,5,8,10};
        int k = 2;

        System.out.println("Minimum Height Difference : " + minimiseHeightDifference(arr, k));
    }
}
