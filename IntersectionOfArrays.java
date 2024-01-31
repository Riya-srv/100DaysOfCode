import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays {
    public static void intersectionOfArrays(int arr1[], int arr2[]){

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for(int i = 0 ; i < arr1.length ; i++){
            hs.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++){
            if(hs.contains(arr2[i])){
                intersectionSet.add(arr2[i]);
            }
        }

        Integer[] intersectionArray = intersectionSet.toArray(new Integer[0]);

        System.out.println("Intersection of two arrays : " + Arrays.toString(intersectionArray));
}

    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5,7};
        int arr2[] = {4,5,6,7,8};

        intersectionOfArrays(arr1, arr2);
    }
}



