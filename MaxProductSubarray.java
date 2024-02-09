public class MaxProductSubarray {
    public static int maximumProductSubarray(int arr[]){
        int n = arr.length;

        int pre = 1, suff = 1;
        int prod = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            if(pre == 0) return 1;
            if(suff == 0) return 1;

            pre = pre*arr[i];
            suff = suff*arr[n-i-1];
            prod = Math.max(prod,Math.max(pre,suff));
        }
        return prod;
    }
    public static void main(String[] args) {
        int arr[] = {6,-1,3,-10,-5};
        System.out.println("Maximum Subarray Product : "+ maximumProductSubarray(arr));
    }
}
