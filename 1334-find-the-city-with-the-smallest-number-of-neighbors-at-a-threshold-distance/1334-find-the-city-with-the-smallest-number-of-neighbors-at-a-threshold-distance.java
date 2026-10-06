class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
       int v=n;
       int ans=0,smallest=n;
       int arr[][]=new int[n][n];
        for(int[] row :arr) Arrays.fill(row,10001);
        for (int[] e : edges){
           arr[e[0]][e[1]] = e[2];
            arr[e[1]][e[0]] = e[2];
        }
      
       for(int i=0;i<n;i++) arr[i][i]=0;
       for(int k=0;k<v;k++){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                // if(arr[i][k]==100000000 || arr[k][j]==100000000) continue;
                arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
            }
        }
       }
       for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(i!=j && arr[i][j]<=distanceThreshold) count++;

        }
        if(count<=smallest){
            ans=i;
            smallest=count;
        }
       }
   
      return ans;
    }
}