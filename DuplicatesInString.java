import java.util.HashMap;

public class DuplicatesInString {
    public static void printDuplicates(String S){

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < S.length() ; i++){
            if(hm.containsKey(S.charAt(i))){
                hm.put(S.charAt(i),hm.get(S.charAt(i))+1);
            }
            else{
                hm.put(S.charAt(i), 1);
            }
        }

        hm.forEach((key,value) -> {
            if(value > 1){
                System.out.println(key + ", count = " + value);
            }
            
        });
        
    }

    public static void main(String[] args){
        String S = "geeksforgeeks";
        printDuplicates(S);
    }
}
