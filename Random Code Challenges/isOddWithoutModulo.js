function isOddWithoutModulo(num) {
  // get the absolute value of the number
  let n = Math.abs(num);
  // create a boolean flag that is initialized to false
  let isOdd = false;
  // iterate up until the number
  for(let i = 1; i <= n; i++)
    // flip the boolean flag for every iteration
    isOdd = !isOdd;
  // return the boolean 
  return isOdd;
}
