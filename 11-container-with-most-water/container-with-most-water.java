class Solution {
    public int maxArea(int[] height) {
        int maxA=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;

            int h;
            if(height[left]>height[right]){
               h =height[right];

            }
            else{
                h=height[left];
            }
            int currentmax=h*width;
            maxA=Math.max(maxA,currentmax);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return maxA;
    }
}