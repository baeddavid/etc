/* Introductory problem to dynamic programming from the Stanford dp power point
   Given the number n, find the number of different ways to write the sum of n 
   using the array of {1, 3, 4} */
   
    public int findNumber(int n) {
        // Declare our array of keys
        int[] key = {1, 3, 4};
        // Create our cache to store previous results
        int[] cache = new int[n + 1];
        
        // Initialize our base cases
        cache[0] = cache[1] = cache[2] = 1;
        cache[3] = 2;
        
        // Begin filling our cache by taking the sum of previous results
        for (int i = 4; i < cache.length; i++) {
            cache[i] = cache[i - 1] + cache[i - 3] + cache[i - 4];
        }
        
        // Return the last element in our cache
        return cache[n];
    }
