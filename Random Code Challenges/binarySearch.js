/* a straight forward implementation of binary search
More or less translated the Java implementation I know */

/* our method takes 4 parameters
the array, the target, the beginning of the array, the end of the array */
function binarySearch(arr, key, start, end){
  // if the start of our array is greater than our array, we have searched the entire array and return null
  if(start > end)
    return null;
  
  // set the mid point of our array. We use Math.floor in the case that the array is an even number of elements
  let mid = Math.floor((start + end) / 2);
  
  // if the mid point of our array is equal to the target, we return it
  if(arr[mid] === key)
    return arr[mid];
    
   // if the mid point is greater than our key, we know that the target is in the left side of our array
  if(arr[mid] > key)
    return binarySearch(arr, key, start, mid -1);
    
  // if the mid point is less than our key, we know that the target is in the right side of our array
  else {
    return binarySearch(arr, key, mid + 1, end);
  }
}
