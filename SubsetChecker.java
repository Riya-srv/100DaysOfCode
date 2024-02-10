import java.util.HashMap;

public class SubsetChecker {
    public static String subsetCheckerInArrays(int a1[],int a2[],int n,int m){

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            hm.put(a1[i],hm.getOrDefault(a1[i],0)+1);
        }

        for(int i = 0 ; i < m ; i++){
            if(!hm.containsKey(a2[i]) || hm.get(a2[i]) == 0){
                return "a2 is not a subset of a1";
            }
            hm.put(a2[i],hm.get(a2[i])-1);
        }
        return "a2 is a subset of a1";
    }

    public static void main(String args[]){
        int a1[] = {2,5,1,1,5,7};
        int n = a1.length;
        int a2[] = {2,5,1,6};
        int m = a2.length;

        System.out.println("Subset checker says : "+subsetCheckerInArrays(a1, a2, n, m));
    }
}
