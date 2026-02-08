class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
      // n=n%k;
      k=k%n;
       rotateA(nums,0,n-1);
       rotateA(nums,0,k-1);
       rotateA(nums,k,n-1);


    }
    public static void rotateA(int[] nums,int left,int right){
        int temp;
       // int n=nums.length;
       // int left=0;
     //   int right=nums.length-1;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
       // return nums;
    }
}