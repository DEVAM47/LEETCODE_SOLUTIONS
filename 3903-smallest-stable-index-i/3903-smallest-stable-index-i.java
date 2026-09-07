class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n=arr.length;
        int[] max=new int[n];
        int[] min=new int[n];
        int maxx=Integer.MIN_VALUE;
        int minn=Integer.MAX_VALUE;
             for (int i = 0; i < n; i++) {
            maxx = Math.max(maxx, arr[i]);
            max[i] = maxx;          
        }
        for(int i=n-1;i>=0;i--){
           minn=Math.min(minn,arr[i]);
            min[i]=minn;
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            int res=max[i]-min[i];
            if(res<=k){
                ans=i;
                break;
            }
        }
        return ans;
    }
}