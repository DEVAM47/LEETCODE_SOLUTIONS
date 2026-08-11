class Solution {
    public boolean count(int[] arr,int mid,int days){
        int sum=0;
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum<=mid){
               sum+=arr[i]; 
            }
            else{
                sum=arr[i];
                c++;
            }

        }
        if(c<=days) return true;
        else return false;
    }
    public int shipWithinDays(int[] arr, int days) {
        int c=0;
        int n=arr.length,max=-1,sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }
        int i=max,j=sum;
        while(i<=j){
            int mid=i+(j-i)/2;
            boolean x=count(arr,mid,days);
            if(x){
                j=mid-1;
            }
            else{
                i=mid+1;
            }

        }
        return i;
    }
}