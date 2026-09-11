class Solution {
    public int totalNumbers(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j || i==k || j==k) continue;
                    int num=arr[i]*100+arr[j]*10+arr[k];
                    if(num>=100 && num%2==0) set.add(num);
                }
            }
        }
        return set.size();
    }
}