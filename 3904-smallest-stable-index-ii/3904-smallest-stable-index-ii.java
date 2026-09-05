class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int count=0;
        int[] maxarr=new int[n];
        int[] minarr=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            maxarr[i]=max;
           

        }
        int ans=-1;
        for(int i=n-1;i>=0;i--){
           min=Math.min(min,arr[i]);
            minarr[i]=min;
        }
        for(int i=n-1;i>=0;i--){
            if((maxarr[i]-minarr[i])<=k) ans=i;
        }
        return ans;
     
    }
}