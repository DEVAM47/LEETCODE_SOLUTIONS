class Solution {
  
    public int search(int[] arr, int target) {
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) j=mid-1;
            else i=mid+1;

        }
        return (arr[i]==target) ? i:-1;
    }
}
