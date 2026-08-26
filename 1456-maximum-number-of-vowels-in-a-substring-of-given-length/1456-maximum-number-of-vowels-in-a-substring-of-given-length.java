class Solution {
    public int maxVowels(String s, int k) {
     int n=s.length();
      int max=0;
      int curr=0;
      for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
           curr++;
      }
      max=Math.max(curr,max);

         
    }
    for(int i=k;i<n;i++){
        char ch=s.charAt(i-k);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            curr--;

        }
        char l=s.charAt(i);
        if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u'){
            curr++;
        }
        max=Math.max(curr,max);

    } 
    return max;
}
}