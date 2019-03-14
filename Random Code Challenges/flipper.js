function flipper(string){
  // split the string into a character array
  string = string.split("");
  // iterate through the array(HOWEVER we flip ever pair of characters, so increase by 2 rather than 1)
  for(let i = 0; i < string.length; i += 2){
    // swap the characters
    let temp = string[i];
    string[i] = string[i + 1];
    string[i + 1] = temp;
  }
  // merge the character array into a string
  string = string.join("");
  // return the string
  return string;
}
