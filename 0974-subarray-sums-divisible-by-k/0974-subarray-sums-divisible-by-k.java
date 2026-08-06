class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        int c=0;
        int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int sum=0;
            

        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum%k==0) c++;
        //     }
        //     // if(arr[i]%k==0) c++;
            
        // }
        // return c;
        int prefixsum=0;
       
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefixsum+=arr[i];
           int  r=prefixsum%k;
           if(r<0) r+=k;
            if(map.containsKey(r)){
                c+=map.get(r);
            }
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return c;
    }
}