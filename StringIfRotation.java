public class StringIfRotation {
    public static boolean stringRotationChecker(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        if(n != m){
            return false;
        }
        else{
            String concatStr = s1+s1;
            if(concatStr.contains(s2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String s1 = "ABCDA";
        String s2 = "CDAAB";

        if(stringRotationChecker(s1, s2)){
            System.out.println("s2 is a rotation of s1");
        }
        else{
            System.out.println("s2 is not a rotation of s1");
        }
    }
}
