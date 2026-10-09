class Solution {
    public int minInsertions(String s) {
        int open=0,insertions=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') open++;
           
            else{
                if(i+1<s.length() && s.charAt(i+1)==')') i++;
                else insertions++;
                if(open>0) open--;
                else insertions++;
            }
        }
        return (open*2)+insertions;

        // Stack<Character> st=new Stack<>();
        // int d=0;
        // for(char ch:s.toCharArray()){
        //      if(d==2  && !st.isEmpty() && st.peek()=='('){
        //         st.pop();
        //         d=0;
                
        //     }
        //     if(ch=='(') st.push('(');
           
           
        //     else{
        //         d++;
                
        //     }
        // }
        // if(d/2==st.size()) return 0;
        // if(d==0 && st.size()>0){
        //     return st.size()*2;

        // }
        // return d;
    }
}