function twoSum(array, target){
  // Create a map
  let map = new Map();
  // iterate through the array
  for(let i = 0; i < array.length; i++){
    // set the complement for each element of the array
    let complement = target - array[i];
    // if our map has the complement return the index and the key
    if(map.has(complement))
      return [i,map.get(complement)];
    // if it is not in our map, add it
    else 
      map.set(array[i],i);
  }
  // exit and return -1,-1 if we have not found it
  return [-1,-1];
}
