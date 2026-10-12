class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int t=n/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i :candyType){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        return Math.min(t,map.size());

    }
}