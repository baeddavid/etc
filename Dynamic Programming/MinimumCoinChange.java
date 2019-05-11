/* We are tasked with finding the minimum amount of coins needed to make change
   Given the array of coins {1,2,5} and an amount of 11 we must return 3 (5,5,1) */
   
public static int minimumCoinChange(int[] coins, int amount){
    // Create a cache with the size of amount + 1
    int[] cache = new int[amount + 1];
    // Fill the array with the maximum integer value
    Arrays.fill(cache, Integer.MAX_VALUE);
    // Initalize the first element to 0, because we can make change for 0 with 0 coins
    cache[0] = 0;

    // Iterate through the cache
    for(int i = 1; i < cache.length; i++){
        // Iterate through our array of coins
        for(int j = 0; j < coins.length; j++){
            /* Set the element at index i to the minimum value of either cache[i] 
                or the number of minimum coins needed of the amount minus each coin plus one */
            cache[i] = Math.min(cache[i], cache[i - coins[j]] + 1);
        }
    }
    // Return the last element for the minimum amount of coins to make change
    return cache[amount];
}
