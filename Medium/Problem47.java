package Medium;

class Problem47 {
    int N;
    List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        N = nums.length;
        Arrays.sort(nums);
        helper(nums,new ArrayList<Integer>(),new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] nums,List<Integer> curr,List<Integer> consumed){
        if(curr.size() == N){
            res.add(new ArrayList<Integer>(curr));
        }
        for(int i=0;i<N;i++){
            if(!consumed.contains(i)){
                curr.add(nums[i]);
                consumed.add(i);
                helper(nums,curr,consumed);
                curr.remove(curr.size()-1);
                consumed.remove(consumed.size()-1);
                while(i<N-1 && nums[i] == nums[i+1]){
                        i++;
                }
            }
        }
    }
}