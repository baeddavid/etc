function orderWeight(strng) {
  // split our string into an array of strings
  let splitString = strng.split(' ');
  
  splitString.sort(function(a,b) {
    // get the respective weights for each number
    let aSum = getSum(a);
    let bSum = getSum(b);
    
    // if weights are equal to each other sort by string value, else sort by number value
    return aSum === bSum ? a.localeCompare(b) : aSum - bSum;
  });
  // join our array of strings back into a single string
  return splitString.join(' ');
}

function getSum(str){
  let result = 0;
  // loop through our string
  for(let i = 0; i < str.length; i++)
    // add the number value of our character at index i to result
    result = result + parseInt(str.charAt(i));
  // return result
  return result;
}
