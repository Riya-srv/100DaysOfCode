import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArrays {
    public static void unionOfArrays(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        HashSet<Integer> hs = new HashSet<>(n+m);

        for(int i = 0 ; i < n ; i++){
            hs.add(arr1[i]);
        }
        for(int i = 0 ; i < m ; i++){
            hs.add(arr2[i]);
        }


        Integer unionArray[] = hs.toArray(new Integer[hs.size()]);
        System.out.println("Union of arrays: " + Arrays.toString(unionArray));
        

    }

    public static void main(String args[]){

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};
        
        unionOfArrays(arr1, arr2);
    }
}
