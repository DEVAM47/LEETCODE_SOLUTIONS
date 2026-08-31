class Solution {
    public int minimumDeletions(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        int mxi=-1;
        int mni=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){max=arr[i]; mxi=i;}
            if(arr[i]<min){ min=arr[i]; mni=i;}
        }
        int diff=mxi-mni;
        int minn=Math.min(mxi,mni);
        int maxx=Math.max(mxi,mni);
        
        int front=maxx+1;
        int back=n-minn;
        int both=minn+1+n-maxx;
        int ans=Math.min(front,Math.min(both,back));

        return ans;
    }
}