class Solution {
    public void solve(int i,int[] nums,List<Integer> temp,List<List<Integer>> result){
        if(i>=nums.length){
            result.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[i]);
        solve(i+1,nums,temp,result);
        temp.remove(temp.size()-1);
        solve(i+1,nums,temp,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        
        List<List<Integer>> result=new ArrayList<>();
        solve(0,nums,temp,result);
        return result;
    }
}