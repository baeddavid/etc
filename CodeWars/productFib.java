    public static long[] productFib(long prod) {
        long[] answer = new long[3];
        long a = 0, b = 1, fib = 0;
        while(a * b < prod){
            fib = a + b;
            a = b;
            b = fib;
        }
        if(a * b == prod){
            answer[0] = a;
            answer[1] = b;
            answer[2] = 1;
        } else {
            answer[0] = a;
            answer[1] = b;
        }
        return answer;
    }
