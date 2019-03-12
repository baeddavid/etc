public static int findFib(){
        // initialize first two values in fib, total, and temp holder for third fib value
        int a = 0, b = 1, total = 0, temp = 0;
        // until 4,000,000
        while(b < 4000000){
            // if it is even we add it to total
            if(b % 2 == 0)
                total += b;
            // store the third fib in temp
            temp = a + b;
            // first fib is now the second
            a = b;
            // second fib is not the third
            b = temp;
        }
        // return the total sum
        return total;
    }
