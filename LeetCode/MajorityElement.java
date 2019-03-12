class Solution {
    public int majorityElement(int[] nums) {
        // create a hash map to store key value pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        // iterate through our arrays
        for(int x : nums){
          // add our key value pairs with a counter as our value
          map.put(x, map.getOrDefault(x, 0) + 1);
          // if the value for a key is greater than half the length of the array, return the key
          if(map.get(x) > nums.length / 2)
            return x;
        }
        // not found so we return -1
        return -1;
    }
}
