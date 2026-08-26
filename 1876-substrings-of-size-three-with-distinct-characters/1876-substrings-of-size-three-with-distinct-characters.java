class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
       int count=0;
      
    //    for(int i=0;i<=n-3;i++){
    //     HashSet<Character> set=new HashSet<>();
    //     set.add(s.charAt(i));
    //     set.add(s.charAt(i+1));
    //     set.add(s.charAt(i+2));
    //     if(set.size()==3) count++;
    //    }
    //    return count;
    for(int i=0;i<n-2;i++){
        if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+2) && s.charAt(i+1)!=s.charAt(i+2) ){
            count++;
        }
        
    }
    return count;
    }
}