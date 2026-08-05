class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
        // int i=0,j=nums.length-1;
        // while(i<=j){
        //     int mid=i+(j-i)/2;
            
        // }

    }
}