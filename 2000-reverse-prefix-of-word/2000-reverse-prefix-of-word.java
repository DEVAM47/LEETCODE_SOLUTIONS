class Solution {
    public void reverse(String x){

    }
    public String reversePrefix(String s, char ch) {
         StringBuilder r=new StringBuilder();
          Boolean flag=false;
           for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
           
            if(ch==curr){
                flag=true;
                String x=s.substring(0,i+1);
                String reversed = new StringBuilder(x).reverse().toString();
                String z=s.substring(i+1,s.length());
               
                r.append(reversed);
                r.append(z);
                break;
            }
            
           }
           if(!flag) return s; 

           return r.toString();
    }
}