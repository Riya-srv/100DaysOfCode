import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();

        que.offer(10);
        que.offer(20);
        que.offer(30);

        System.out.println("Front element of queue : " + que.peek());

        System.out.println("Dequeue operation : " + que.poll());

        System.out.println("Size of queue : " + que.size());

        //Printing all the elements of the queue
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

    }
}
