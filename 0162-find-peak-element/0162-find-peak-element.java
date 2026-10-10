class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
        int peak=0,i=1,j=arr.length-2;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
              return mid;
                
            }
            else if(arr[mid]<arr[mid-1]){
                j=mid-1;
            }
            else{
                i=mid+1;

            }
        }
        
    return -1;
    }
}