class Solution {

    public static void subsetFunc(int[] nums, List<List<Integer>> ans, int index, List<Integer> subList){
        // adding the sublist in the ans vali list
        ans.add(new ArrayList<>(subList));
        for(int i = index; i < nums.length; i++) {
            // add data to the sublist
            subList.add(nums[i]);
            // move to the next index
            subsetFunc(nums, ans, i + 1, subList);
            // backtracking 
            subList.remove(subList.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsetFunc(nums, ans, 0, new ArrayList<>());
        return ans;
    }
}
