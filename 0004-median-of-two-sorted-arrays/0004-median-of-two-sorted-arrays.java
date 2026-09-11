class Solution {
    public void merge(int[] num1,int[] num2,double[] res){
     int i=0,j=0,k=0;
        while(i<num1.length && j<num2.length){
            if(num1[i]>num2[j]){
                res[k++]=num2[j++];
            }
            else{
                res[k++]=num1[i++];
            }
        }
        while(i<num1.length) res[k++]=num1[i++];
        while(j<num2.length) res[k++]=num2[j++];
        
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length,b=nums2.length;
        int n=a+b;
        int k=0;
        double res[] =new double[n];
        // for(int i=0;i<a;i++){
        //     res[k++]=nums1[i];
        // }
        // for(int i=0;i<b;i++){
        //     res[k++]=nums2[i];
        // }
        // Arrays.sort(res);
        merge(nums1,nums2,res);
        if(n%2==0){
            int mid1=n/2;
            int mid2=(n-1)/2;
            double ans=(mid1+mid2)/2;
            return (res[mid1]+res[mid2])/2.0;
        }
        else{
            return (double)res[(n-1)/2];
        }
       

    }
}