class Solution {
    public String evaluate(String s, List<List<String>> k) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<k.size();i++){
            map.put(k.get(i).get(0),k.get(i).get(1));
        }
        int i=0;
        while(i<n){
            char ch=s.charAt(i);
//   boolean flag=false;
            
            if(ch=='('){
                int j=i+1;
                StringBuilder sub=new StringBuilder();
                while(s.charAt(j)!=')'){
               
               sub.append(s.charAt(j++));
         

                }
                str.append(map.getOrDefault(sub.toString(),"?"));
                i=j+1;
            }
            else{
                str.append(ch);
                i++;
            }
         
               
            
            }
            
            
        
return str.toString();
    }
}
// class Solution {
//     public String evaluate(String s, List<List<String>> knowledge) {
//         Map<String, String> map = new HashMap<>();
//         for (List<String> pair : knowledge) {
//             map.put(pair.get(0), pair.get(1));
//         }

//         StringBuilder result = new StringBuilder();
//         int n = s.length();
//         int i = 0;

//         while (i < n) {
//             char ch = s.charAt(i);
//             if (ch == '(') {
//                 int j = i + 1;
//                 StringBuilder key = new StringBuilder();
//                 while (s.charAt(j) != ')') {
//                     key.append(s.charAt(j));
//                     j++;
//                 }
//                 result.append(map.getOrDefault(key.toString(), "?"));
//                 i = j + 1; // move past ')'
//             } else {
//                 result.append(ch);
//                 i++;
//             }
//         }

//         return result.toString();
//     }
// }