class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int i=0,j=0;
        int min=Integer.MAX_VALUE;
        StringBuilder ans=new StringBuilder();
    
        while(i<n){
            StringBuilder str=new StringBuilder();
            int count=0;
            j=i;
            while(j<n){
                if(s.charAt(j)=='1') count++;
                if(count<k){
                    str.append(s.charAt(j));
                    j++;

                }
                else if(count==k){
                    str.append(s.charAt(j));
                    int len=str.length();
                    if(len<min){
                        min=len;
                        ans=str;
                    }
                    else if(min==len && str.toString().compareTo(ans.toString())<0){
                        ans=str;
                    }
                    
                    break;
                }
                
              
            }
              i++;

        }
return ans.toString();    
}
}