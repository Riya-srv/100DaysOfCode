public class Queue {
    static int front, rear, size;
    static int MAX_SIZE=100;
    static int[] arr;

    public Queue(){
        arr = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull(){
        if(size == MAX_SIZE){
            System.out.println("Queue is full!");
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(size == 0){
            System.out.println("Queue is empty!");
            return true;
        }
        return false;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        arr[rear] = val;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        int val = arr[front];
        front = (front+1)%MAX_SIZE;
        size--;
        return val;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Queue que = new Queue();
        que.enqueue(2);
        que.enqueue(4);
        que.enqueue(6);
        que.enqueue(8);

        System.out.println("Front element: " + que.peek());

        System.out.println("Dequeued element: " + que.dequeue());

        System.out.println("Front element after dequeue: " + que.peek());
}
}
