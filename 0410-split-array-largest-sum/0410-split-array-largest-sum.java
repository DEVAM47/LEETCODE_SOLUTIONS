class Solution {
    public boolean check(int[] arr,int mid,int k){
       int sum=0;
       int c=1;
       for(int i:arr){
        if(sum+i>mid){
            c++;
            sum=0;

        }
        sum+=i;

       }
       if(c<=k) return true;
       else{
        return false;
       }

    }
    public int splitArray(int[] arr, int k) {
        int min=Integer.MIN_VALUE;
        int sum=0;
        for(int i:arr){
            min=Math.max(min,i);
            sum+=i;
        }
        int i=min,j=sum;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            boolean x=check(arr,mid,k);
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