function booleanRotated(string1, string2){
  // trim both strings and split the strings into an character array
  string1 = string1.trim().split("");
  string2 = string2.trim().split("");
  
  // sort both the character arrays
  let sortedString1 = string1.sort();
  let sortedString2 = string2.sort();

  // iterate through the character array and compare them to each other
  for(let i = 0; i < sortedString1.length; i++){
    // if one character is not equal to other return false
    if(sortedString1[i] !== sortedString2[i])
      return false;
  }
  // if we exit the loop, we know that they are equal to each other
  return true;
}
