class Solution {
    public int findMin(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     min=Math.min(min,nums[i]);
        // }
        // return min;
        int n=nums.length-1;
        int i=0,j=nums.length-1;
        while(i<n && nums[i]==nums[n]) i++;
        while(i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[nums.length-1]){
                i=mid+1;
            }
            else{
                 j=mid;
            }
        }
        return  nums[i];

    }
}