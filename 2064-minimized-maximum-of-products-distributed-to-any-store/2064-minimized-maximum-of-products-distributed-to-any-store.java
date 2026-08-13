class Solution {
    public boolean check(int[] arr, int mid,int k){
        int c=0;
        if(mid==0) return false;
        for(int i:arr){
            c+=(i-1)/mid+1;


        }
        if(c<=k) return true;
        else return false;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int max=-1;
        for(int i:arr){
            max=Math.max(i,max);

        }
        int i=1,j=max,ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            boolean x=check(arr,mid,n);
            if(x){
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