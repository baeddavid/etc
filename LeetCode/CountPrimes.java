class Solution {
    public int countPrimes(int n) {
        // create a counter variable
        int counter = 0;
        // iterate through all integers until n
        for(int i = 1; i < n; i++)
          // if i is prime increase counter
          if(isPrime(i) == true)
            counter++;
        // return coumter
        return counter;
    }
    // is prime method
    public boolean isPrime(int x){
      // 2 is always prime
      if(x == 2)
        return true;
      // if x is less than 2 or divisible by 2 it is not prime
      if(x < 2 || x % 2 == 0)
        return false;
      // if x is evenly divided i in this loop it is not prime
      for(int i = 3; i * i <= x; i+= 2)
        if(x % i == 0)
          return false;
      return true;
    }
}
