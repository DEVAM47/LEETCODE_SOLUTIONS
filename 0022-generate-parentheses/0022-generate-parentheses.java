class Solution {
    public void generate(List<String> ans,int l,int r,int n,String s){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(ans,l+1,r,n,s+"(");
        if(r<l) generate(ans,l,r+1,n,s+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(ans,0,0,n,"");
        return ans;
    }
}