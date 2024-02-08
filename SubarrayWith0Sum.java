import java.util.HashSet;

public class SubarrayWith0Sum {
    public static boolean subarrayWithZeroSum(int arr[]){
        int n = arr.length;

        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
            if(arr[i] == 0 || sum == 0){
                return true;
            }
            if(!hs.contains(sum)){
                hs.add(sum);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {1,3,-5,2};

        System.out.println(subarrayWithZeroSum(arr));
    }
}
