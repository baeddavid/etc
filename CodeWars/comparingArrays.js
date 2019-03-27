// check if value of array 2 is equal to all values of array 1 squared

function comp(array1, array2){
  // if either array is null, return false
  if(array1 === null || array2 === null)
    return false;
  
  // begin by sorting our arrays(ascending)
  array1.sort((a,b) => a - b);
  array2.sort((a,b) => a - b);
  
  // loop through our array checking each element 
  for(let i = 0; i < array1.length; i++){
    let squared = array1[i] * array1[i];
    // if squared is not equal to the value at i for array2 return false
    if(squared !== array2[i])
      return false;
  } 

// we exit the for loop if it is true
return true;
}
