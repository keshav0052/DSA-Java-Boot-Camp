class Solution {

    public static void func(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> subList){
       // base condition 
       if(target == 0){
        ans.add(new ArrayList<>(subList));
        return;
       }
       if(index == candidates.length || target < 0){
        return;
       }
       // logic 
       // add the first data in the sublist as an ans
       subList.add(candidates[index]); 
       // if i want to pick the data unlimited times 
       func(candidates, target - candidates[index], index, ans, subList);
       // backTracking 
       subList.remove(subList.size() - 1);
       // if i want to explore other numbers too 
       func(candidates, target, index + 1, ans, subList);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(candidates, target, 0, ans, new ArrayList<>());
        return ans;
        
    }
}
