class Solution {
    public List<String> fizzBuzz(int n) 
        //create a list since we need to return a list
        List<String> list = new ArrayList<>();
        //iterate starting from 1 until and including n
        for(int i = 1; i <= n; i++){
          //if i is divisible by 15 add FizzBuzz to the list
          if(i % 15 == 0)
            list.add("FizzBuzz");
          //if i is divisible by 3 add Fizz to the list
          else if(i % 3 == 0)
            list.add("Fizz");
          //if i is divisble by 5 add Buzz to the List
          else if(i % 5 == 0)
            list.add("Buzz");
          //else add i to our list. Since our list only takes strings, call the to string method for i.
          else
            list.add(Integer.toString(i));
        }
        //return our list.
        return list;
    }
}
