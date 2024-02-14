public class CountSquares {
        public static void main(String[] args) {
        int N = 25; // Example value of N
        int count = 0;
        int i = 1;
        
        while (true) {
        int square = i * i;
        if (square < N) {
                count++;
        } else {
                break;
                }
                i++;
            }
        System.out.println("Number of perfect squares less than " + N + " is: " + count);

    }
}

