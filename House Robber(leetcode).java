class Solution {

    public int robFrom(int[] nums, int index){
        // base condition 
        if(index >= nums.length){
            return 0;
        }
        // logic
            int pick = nums[index] + robFrom(nums, index + 2);
            int notPick = robFrom(nums, index + 1);
        
        return Math.max(pick, notPick);
    }
    public int rob(int[] nums) {
        return robFrom(nums, 0);       
    }
}
