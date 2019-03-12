class Solution {
    public void moveZeroes(int[] nums) {
        // two pointer method
        int index = 0;
        // iterate through our array until we find an element that is not 0
        for(int i = 0; i < nums.length; i++)
          // if the element is not 0, assign the value of the non-zero element to the index pointer.
          if(nums[i] != 0)
            // increase the value of index to continue keeping track of the position 
            nums[index++] = nums[i];
        for(int i = index; i < nums.length; i++)
          // assign all values after index to 0 to shift all 0s in an array to the end
          nums[i] = 0;
    }
}
