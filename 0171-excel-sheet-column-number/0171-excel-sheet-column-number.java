class Solution {
    public int titleToNumber(String s) {
       //26*i +ch
       long sum=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
         sum=sum*26+(ch-'A'+1);
       }
       return (int)sum;
    }
}