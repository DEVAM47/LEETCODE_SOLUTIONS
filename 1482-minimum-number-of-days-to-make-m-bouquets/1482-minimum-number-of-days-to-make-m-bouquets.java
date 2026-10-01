class Solution {
    public int can(int[] arr,int mid,int k){
        int count=0;
        int bc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                bc++;
                count=0;
               
            }
        }
         return bc;
    }
    public int minDays(int[] arr, int m, int k) {
         int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int ans=-1;
        // if(m*k>arr.length) return ans;
        int i=0,j=max;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(can(arr,mid,k)>=m){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}