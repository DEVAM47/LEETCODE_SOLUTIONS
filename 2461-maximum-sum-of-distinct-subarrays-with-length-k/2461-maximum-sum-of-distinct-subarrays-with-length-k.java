class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        long sum=0;
        long max=0;
        int i=0;
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        int j=0;
        while(i<=n-k && j<n){
            if(!set.contains(arr[j])){ sum+=arr[j];    set.add(arr[j]);}
            else{
                while(i<j && arr[i]!=arr[j]){
                    sum-=arr[i];
                    set.remove(arr[i]);
                    i++;
                }
            i++;

            }
        
            
            if(set.size()==k){
                max=Math.max(sum,max);

                set.remove(arr[i]);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        return max;    }
}