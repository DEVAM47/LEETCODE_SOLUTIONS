class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0,j=0;
        int max=0;
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char left=s.charAt(i);
                map.put(left,map.get(left)-1);
                i++;
 
            }
             max=Math.max(max,j-i+1);
           j++;

            
        }
        return max;
    }
}