class Solution {
    public int[] plusOne(int[] digits) {
        // start from the end of our array
        for(int i = digits.length - 1; i >= 0; i--){
          // if the element is not equal to 9, increase it and exit from the loop
          if(digits[i] != 9){
            digits[i]++;
            break;
            // if it is equal to 9, set it to 0 and stay in the loop
          } else {
            digits[i] = 0;
          }
        }
        // in the rare case that the array is {9,9,9}, we must create a new strArray
        if(digits[0] == 0){
          // if the first element is 0, we create a new array with a size of +1 then digits
          int[] answer = new int[digits.length + 1];
          // set the first element to 1
          answer[0] = 1;
          // return our special case array
          return answer;
        } 
        // return our array
        return digits;
    }
}
