public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
      return 0;
  }
  
  int k = 1;
  
  for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
          nums[k] = nums[i];
          k++;
      }
  }
  
  return k;
  }

  public static void main(String[] args) {
    int nums[] = {2,3,3,4,5,6};
    System.out.println(removeDuplicates(nums));
  }
}
