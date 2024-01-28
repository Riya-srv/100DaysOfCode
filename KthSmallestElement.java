import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int kthsmallest(int arr[], int k){

        if(arr == null || k > arr.length || k < 1){
            throw new IllegalArgumentException("Invalid Input");
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            pq.add(arr[i]);

            if(i >= k){
                pq.poll();
            }
        }

       
        return pq.peek();
    }

    public static void main(String args[]){

        int arr[] = {2,10,4,3,20,15};

        int ksmall = kthsmallest(arr, 3);

        System.out.println("kth smallest element is : " + ksmall);

    }
}


