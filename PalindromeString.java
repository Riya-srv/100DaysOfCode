public class PalindromeString {
    public static boolean palindromeStringChecker(String str){

        int i = 0;
        int j = str.length()-1;

        while(i<j){

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "aabbaba";
        if(palindromeStringChecker(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
