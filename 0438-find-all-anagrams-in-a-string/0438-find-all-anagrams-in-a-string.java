class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pfreq=new int[26];
        ArrayList<Integer> ans=new ArrayList<>();
        for(char ch :p.toCharArray()){
            pfreq[ch-'a']++;

        }
        int n=s.length(),m=p.length();
        for(int i=0;i<=n-m;i++){
            int[] sfreq=new int[26];
            for(int j=i;j<i+m;j++){
                char ch=s.charAt(j);
                sfreq[ch-'a']++;
                
            }
            if(Arrays.equals(pfreq,sfreq)){
                ans.add(i);

            }
        }
        return ans;
    }
}