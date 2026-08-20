class Solution {
    public int[] resultArray(int[] arr) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(arr[0]);
        arr2.add(arr[1]);
        int idx1=0;
        int idx2=0;
        int n=arr.length;
        for(int i=2;i<n;i++){
            if(arr1.get(idx1)>arr2.get(idx2)){
                  arr1.add(arr[i]);
                  idx1++;
            }
            else{
                arr2.add(arr[i]);
                idx2++;
            }



        }
        int[] ans=new int[n];
        for(int i=0;i<arr1.size();i++){
            ans[i]=arr1.get(i);
        }
        int idx=arr1.size();
        for(int j=0;j<arr2.size();j++){
            ans[idx++]=arr2.get(j);

        }
        return ans;
    }
}