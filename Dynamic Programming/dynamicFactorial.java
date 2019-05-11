public int[] dynamicFactorial(int n){
    // Create a cache array with the size of n + 1
    int[] cache = new int[n + 1];
    // Initialize the first element to 1
    cache[0] = 1;
    
    // Fill the array at index i with the result of the previous index with i
    for(int i = 1; i < cache.length; i++)
        cache[i] = i * cache[i - 1];
    
    // Return the last element of the array
    return cache[n];
}
