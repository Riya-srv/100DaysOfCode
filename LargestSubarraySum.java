public class LargestSubarraySum {
    public static int getLargestSubarraySum(int arr[]){
        int n = arr.length;
        int max_till_here = arr[0];
        int maxi = arr[0];

        for(int i = 1 ; i < n ; i++){

            max_till_here = Math.max(arr[i] , max_till_here + arr[i]);

            maxi = Math.max(maxi, max_till_here);
        }
        return maxi;
    }

    public static void main(String args[]){

        int arr[] = {1,2,3,-2,5};

        System.out.println("Largest Subarray Sum : " + getLargestSubarraySum(arr));
    }
}
