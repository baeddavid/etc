import java.util.*;
public class SumSquaredDivisors {
	    public static int[] findDivisors(long n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                list.add(i);

        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);

        return arr;
    }

    public static int squareSum(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        int total = 0;
        for(int x : arr)
            total += x;

        return total;
    }

    public static String[] stringArraylistSquared(long m, long n){
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        for(long i = m; i <= n; i++){
            int[] arr = findDivisors(i);
            int x = squareSum(arr);
            if(Math.sqrt(x) -(int)Math.sqrt(x) == 0) {
                s ="[" + i + ", " + x + "]";
                list.add(s);
            }
        }
        String[] arr = new String[list.size()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);

        return arr;
    }

    public static String listSquared(long m, long n){
        String[] arr = stringArraylistSquared(m, n);
        String s = "[";
        for(int i = 0; i < arr.length; i++) {
            s += arr[i];
            if(i + 1 != arr.length)
                s += ", ";
        }
        s += "]";

        return s;
    }
