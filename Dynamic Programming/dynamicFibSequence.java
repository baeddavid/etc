public int dynamicFib(int n){
    // Create an array with n + 1 as its size
    int[] cache = new int[n + 1];
    // Initialize the first element to a zero place holder
    cache[0] = 0;
    // Initialize the second element to 1 as a base case
    cache[1] = 1;
    
    // Following the recurrence relation of the fib Sequence Fib(n) = Fib(n - 1) + Fib(n - 2), we fill the cache array
    for(int i = 2; i < cache.length; i++){
        cache[i] = cache[i - 1] + cache[i - 2];
    }
    
    // Return the last element of the cache for the Fib value of n
    return cache[n];
}
