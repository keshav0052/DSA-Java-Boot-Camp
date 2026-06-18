class Solution {

    public static int minCoins(int[] coins, int amount) {
        // base condition 
        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        // logic 
        int minimum = Integer.MAX_VALUE;
        for(int i = 0;  i < coins.length; i++) {
           int newAmount =  minCoins(coins, amount - coins[i]);
        if(newAmount != Integer.MAX_VALUE){
            minimum = Math.min(newAmount + 1, minimum);
            }
        }
        return minimum;
    }
    public int coinChange(int[] coins, int amount) {
        int newAmount = minCoins(coins, amount);
        return (newAmount == Integer.MAX_VALUE) ? - 1 : newAmount;
    }
}
