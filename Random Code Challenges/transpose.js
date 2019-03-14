function transpose(array){
  // create a new array to push our answer into
  let answer = [];
  // find the max length of either string
  let maxLength = Math.max(array[0].length, array[1].length);
  // iterate through our strings
  for(let i = 0; i < maxLength; i++)
    // push the character into our array. IF there is no character to be pushed we push in a space
    answer.push((array[0][i] || " ") + " " + (array[1][i] || " "));
  // combine our characters together with a new line inbetween ever character
  answer.join('/n');
  
  // return answer
  return answer;
}
