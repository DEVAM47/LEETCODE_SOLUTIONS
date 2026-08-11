class Solution {
    public boolean count(int[] arr,int mid,int thes){
        int c=0;
        for(int i=0;i<arr.length;i++){
            int per=arr[i]/mid;
            int rem=arr[i]%mid;
            if(rem!=0) per++;
            c+=per;
        }
        if(c<=thes) return true;
        else return false;
    }
    public int smallestDivisor(int[] arr, int threshold) {
        int max=-1;
        int sum=0;
        for(int i:arr){
            max=Math.max(max,i);
            sum+=i;

        }
        int i=1,j=max;
        while(i<=j){
            int mid=i+(j-i)/2;
            boolean x=count(arr,mid,threshold);
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