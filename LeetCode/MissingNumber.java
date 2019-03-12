class Solution {
    public int missingNumber(int[] nums) {
        // create a hash set
        HashSet<Integer> set = new HashSet<>();
        // add all values in our array to our set
        for(int x : nums)
          set.add(x);
        // create a counter for loop, that counts from 0 to the length of the array + 1
        for(int i = 0; i <= nums.length; i++)
          // if our set does not contain i, that is our missing number
          if(!set.contains(i))
            return i;
        // there are no missing numbers 
        return -1;
    }
}
