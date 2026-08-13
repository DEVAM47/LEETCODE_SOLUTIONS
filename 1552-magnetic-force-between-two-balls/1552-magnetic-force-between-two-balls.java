class Solution {
    public boolean check(int[] arr,int mid,int k){
        int count=1;
        int last=arr[0];
        for(int q:arr){
           if(q-last>=mid){
            count++;
            last=q;
           }

        }
        return count>=k;
    }
    public int maxDistance(int[] arr, int m) {
      
       Arrays.sort(arr);
       int n=arr.length;
      int max=arr[n-1]-arr[0];
       int ans=0;
       int i=0,j=max;
       while(i<=j){
        int mid=i+(j-i)/2;
        boolean x=check(arr,mid,m);
        if(x){
            ans=mid;
            i=mid+1;

        }
        else{
            j=mid-1;
        }
       }
      return ans ;
    }
}