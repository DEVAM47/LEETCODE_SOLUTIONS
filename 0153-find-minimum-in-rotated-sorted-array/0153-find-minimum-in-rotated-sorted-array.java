class Solution {
    public int findMin(int[] arr) {
        // Arrays.sort(nums);
        // return nums[0];

        int i=0,j=arr.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[j]){
                i=mid+1;

            }
            else{
                j=mid;
            }

        }
        return arr[j];
        

    }
}