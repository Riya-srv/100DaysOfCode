public class MinimiseJumps {
    public static int minimiseJumpsToArrayEnd(int nums[]){
        int jumps = 0;
        int pos = 0;
        int dest = 0;

        for(int i = 0 ; i < nums.length-1 ; i++){
            dest = Math.max(dest, nums[i]+i);

            if(pos == i){
                pos = dest;
                jumps++;
            }
        }
        return jumps;
    }

    public static void main(String args[]){
        int nums[] = {2,3,1,1,4};

        System.out.println("Minimum no. of jumps to reach the end of the array : "+ minimiseJumpsToArrayEnd(nums));
    }
}
