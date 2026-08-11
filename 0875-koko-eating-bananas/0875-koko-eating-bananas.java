class Solution {
    public int counthrs(int[] arr,int k){
        int hrs=0;
        for(int x:arr){
            hrs+=(x+k-1)/k;
        }
        return hrs;
    }
    public int minEatingSpeed(int[] arr, int k) {
        int n=arr.length;
        int max=-1;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);


        }
        int i=1,j=max;
        int ans=max;
        while(i<j){
            int mid=i+(j-i)/2;
            int result=counthrs(arr,mid);
            if(k>=result){
                ans=mid;
                j=mid;

            }
            else{
                i=mid+1;

            }
        }
        return ans;
    }
}