class Solution {
    public int solve(int i,int[] arr,int target){
        if(i==arr.length){
            if(target==0){
                return 1;
            }
            else return 0;

        }
        int ntake=solve(i+1,arr,target+arr[i]);
        int take=solve(i+1,arr,target-arr[i]);
        return ntake+take;
    }
    public int findTargetSumWays(int[] arr, int target) {
        return solve(0,arr,target);
    }
}