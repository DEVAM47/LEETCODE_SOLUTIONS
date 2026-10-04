class Solution {
    Boolean t[][];
    boolean solve(int i,int open,String s){
        if(open<0) return false;
        if(i==s.length()) return open==0;
        boolean isvalid=false;
        if(t[i][open]!=null) return t[i][open];
        if(s.charAt(i)=='('){
            isvalid |=solve(i+1,open+1,s);
        }
        
        else if(s.charAt(i)=='*'){
            isvalid |=solve(i+1,open+1,s);
            isvalid |=solve(i+1,open,s);
            isvalid |=solve(i+1,open-1,s);
        }
        else {
            isvalid |=solve(i+1,open-1,s);
        }
        return t[i][open]=isvalid;
    }
    public boolean checkValidString(String s) {
        int n=s.length();
        t=new Boolean[n+1][n+1];
        return solve(0,0,s);
    }
}