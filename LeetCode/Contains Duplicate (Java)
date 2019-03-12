class Solution {
    public boolean containsDuplicate(int[] nums) {
        //create a hash set to store our elements
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
          // if our set contains x we return true
          if(set.contains(x))
            return true;
          else
            // if our set doesn't contain x, we add it to our set
            set.add(x);
        // if we exit the for loop, there are no duplicates
        return false;
    }
}
