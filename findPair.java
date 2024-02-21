import java.util.HashSet;

public class findPair {
    public static boolean findPairWithGivenDiff(int arr[],int diff){
        int size = arr.length;

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < size ; i++){
            if(hs.contains(arr[i]-diff) || hs.contains(arr[i]+diff)){
                return true;
            }
            else{
                hs.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,7,9,20};

        System.out.print(findPairWithGivenDiff(arr, 15));
    }
}
