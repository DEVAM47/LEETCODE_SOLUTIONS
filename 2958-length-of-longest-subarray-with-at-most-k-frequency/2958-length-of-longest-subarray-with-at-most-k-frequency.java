class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int n=arr.length;
        int max=0;
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            
                while(map.get(arr[j])>k){
                    map.put(arr[i],map.get(arr[i])-1);
                    i++;
                   
                }
            
            
                max=Math.max(max,j-i+1);
                j++;
            }
             return max;
                


        }
       
    }
