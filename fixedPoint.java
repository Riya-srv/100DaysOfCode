import java.util.ArrayList;

public class fixedPoint {
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> rs = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == i+1){
                rs.add(i+1);
            }
        }
        return rs;
    }


    public static void main(String[] args) {
        int arr[] = {15,2,3,53,5};
        System.out.println(valueEqualToIndex(arr,5));
    }
}
