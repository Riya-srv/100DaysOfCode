public class RecusiveBasics {
    public static void printNames(int n){
        if(n > 0){
            System.out.print("Riya ");
            printNames(n-1);
        }
    }

    public static void print1toN(int N){
        if(N > 0){
            print1toN(N-1);
            System.out.print(N+" ");
        }
    }

    public static void printNto1(int N){
        if(N > 0){
            
            System.out.print(N+" ");
            print1toN(N-1);
        }
    }


    
    public static void main(String[] args) {
        int N = 5;
        printNames(N);
        System.out.println();
        print1toN(N);
        System.out.println();
        printNto1(N);
    }
}
