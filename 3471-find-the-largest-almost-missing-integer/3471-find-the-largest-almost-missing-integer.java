class Solution {
    public int largestInteger(int[] arr, int k) {
        // int missing=-1;
        // int n=arr.length;
        // int remove=0;
        // int prev=0,max=0;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int x=0;
        // while(x<n){
        // for(int i=x;i<k;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        //     if(map.get(arr[i])<2){
        //         prev=max;
        //         max=Math.max(max,arr[i]);
                

        //     }
        // }
        //     if(map.get(max)>1){
        //         max=prev;

        //     }
        //     map.remove(remove++);
        //     x+=k;

        // }
   
        // return max; 
    
int n=arr.length;
int[] count=new int[51];
for(int i=0;i<=n-k;i++){
    boolean[] seen=new boolean[51];
    for(int j=i;j<i+k;j++){
        if(!seen[arr[j]]){
            count[arr[j]]++;
            seen[arr[j]]=true;
        }
    }
}
int ans=-1;
for(int i=0;i<51;i++){
    if(count[i]==1){
        ans=i;
    }
}
return ans;
    }
       
    }
