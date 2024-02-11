import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumSolution(int arr[],int target){
        int n = arr.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            int k = target - arr[i];
            if(hm.containsKey(k)){
                return new int[] {hm.get(k),i};
            }
            else{
                hm.put(arr[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String args[]){
        int arr[] = {5,7,2,10};
        int target = 9;
        int result[] = twoSumSolution(arr, target);
        if(result.length == 2){
            System.out.println(result[0]+","+result[1]);
        }
        else{
            System.out.println("No pair found");
        }
        
    }
}
