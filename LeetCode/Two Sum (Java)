class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map, elements will be our key, indices will be our value
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
          // we are looking for the complement of each element that will equal to our target
          int complement = target - nums[i];
          // if our map contains the value of complement return the key for it and i in an array
          if(map.containsKey(complement))
            return new int[] {i, map.get(complement)};
          else
            // add our element and index to the map
            map.put(nums[i], i);
          }
        // we have not found the two sum and return {-1,-1}
        return new int[] {-1,-1};
    }
}
