class Solution {
    Boolean[][] memo;
    boolean solve(int i,int target,int[] nums){
        if(target==0) return true;
        if(target<0) return false;
        if(i>nums.length-1) return false;
        if(memo[i][target]!=null) return memo[i][target];
        boolean take=solve(i+1,target-nums[i],nums);
        boolean nottake=solve(i+1,target,nums);
         memo[i][target]=take || nottake;
         return memo[i][target];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2!=0) return false;
       
        int target=sum/2;
        memo=new Boolean[nums.length][target+1];
        return solve(0,target,nums);

    }
}