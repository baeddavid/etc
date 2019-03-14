function bigFlipper(string, key){
  // split our string into a character array
  let charArray = string.split('');
  // create a variable that is an empty string
  let answer = '';
  // while the length of our character array is greater than 0
  while(charArray.length > 0)
    // we do 3 things: we remove every keyth from our character array, reverse it, then join it together and add it to our answer
    answer += charArray.splice(0,key).reverse().join('');
  // return our answer
  return answer;
}
