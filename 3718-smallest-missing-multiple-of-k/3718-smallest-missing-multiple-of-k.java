class Solution {
    public int missingMultiple(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i=1;i<=100;i++){
            if(!set.contains(i*k)) return i*k;
        }
        return k*101;
    }
}