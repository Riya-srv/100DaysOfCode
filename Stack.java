public class Stack {
    private static int MAX_SIZE = 100;
    private static int top;
    private static int[] arr;

    public Stack(){ //constructor
        top = -1;
        arr = new int[MAX_SIZE];
    }

    public boolean isFull(){
            if(top == MAX_SIZE-1){
                return true;
            }
            return false;
    }

    public boolean isEmpty(){
        if(top == -1) {
            return true;
        }
        return false;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        arr[++top] = val;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Top element: " + s.peek());

        System.out.println("Popped element: " + s.pop());

        System.out.println("Top element after pop: " + s.peek());

        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
