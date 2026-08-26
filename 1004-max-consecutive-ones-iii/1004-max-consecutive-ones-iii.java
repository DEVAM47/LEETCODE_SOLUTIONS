class Solution {
    public int longestOnes(int[] arr, int k) {
          int count=1,max=0;
        int ls=0,fs=0,zc=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==0) zc++;
             if(zc>k){
                 if(arr[ls]==0) zc--;
              ls++;
             }
                
           
            }
        // if(zc==arr.length-1 && k==0) return 0;
        return arr.length-ls;
    }
}