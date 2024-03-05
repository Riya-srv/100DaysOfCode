public class TwoStacks {
    int size = 100;
    int arr[] = new int[size];
    int top1;
    int top2;
    public TwoStacks(){
        top1 = -1;
        top2 = size;
    }

    public void push1(int x){
        if(top1 < top2-1){
            top1++;
            arr[top1] = x;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int x){
        if(top1 < top2-1){
            top2--;
            arr[top2] = x;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop1(){
        int ans = -1;
        if(top1 != -1){
            ans = arr[top1];
            top1--;
        }
        return ans;
    }

    public int pop2(){
        int ans = -1;
        if(top2 != -1){
            ans = arr[top2];
            top2--;
        }
        return ans;
    }

    public static void main(String[] args) {
    TwoStacks stacks = new TwoStacks();
    stacks.push1(1);
    stacks.push2(2);
    stacks.push1(3);
    stacks.push2(4);
    stacks.push1(5);
    System.out.println(stacks.pop1()); //should be 5
    System.out.println(stacks.pop2()); //should be 4

    }
}
