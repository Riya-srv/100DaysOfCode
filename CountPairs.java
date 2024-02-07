import java.util.HashMap;

public class CountPairs {
    public static int countPairsWithK(int arr[], int n, int k){

        HashMap<Integer,Integer> m = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            int b = k - arr[i];
            if(m.containsKey(b)){
                count += m.get(b);
            }
            m.put(arr[i], m.getOrDefault(arr[i],0) + 1);
        }
        return count;
    }

    public static void main(String args[]){
        int arr[] = {1,5,5,1};

        System.out.println("No. of pairs with sum k : " + countPairsWithK(arr, 4, 6 ));
    }
}
