class Solution {
    public int singleNumber(int[] nums) {
        //create a HashSet
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
          //if our set already contains x, we delete it.
          if(set.contains(x))
            set.remove(x);
          //if our set does not contain it we add x to the set.
          else
            set.add(x);

        for(int x : set)
          //return all values(in this case the only value) in the set.
          return x;
        //if there are no duplicates return -1.
        return -1;
    }
}
