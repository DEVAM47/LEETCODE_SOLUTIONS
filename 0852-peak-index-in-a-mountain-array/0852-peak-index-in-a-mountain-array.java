class Solution {
    int rec(int[] arr,int i,int j,int p,int idx){
        if(i>j) return idx;
        int mid=i+(j-i)/2;
        if(arr[mid]>arr[mid+1]) {
          
            return rec(arr,i,mid-1,arr[mid],mid);}
        else{
            return rec(arr,mid+1,j,arr[mid+1],mid+1);
        }
    }
    public int peakIndexInMountainArray(int[] arr) {
        int i=0,j=arr.length-1;
        return rec(arr,i,j,0,-1);

    }
}