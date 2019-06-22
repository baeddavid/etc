function translatePigLatin(str) {
  let charArr = str.split('');
  let x = constClusterIndex(str);


  let firstChar = charArr.splice(0, x);
  if(!isVowel(firstChar[0]))  {
     str = str.substring(x);
    for(let x of firstChar)
        str += x;
    str += 'ay';
  } else {
      str += 'way';
  }
  return str;
}

function isVowel(char) {
    let vowelArr = ['a','e','i','o','u'];
    char = char.toLowerCase();

    for(let x of vowelArr)
        if(char === x)
            return true;
    return false;
}

function constClusterIndex(str) {
    let x;
    let arrIndex = [];
  for(let i = 0; i < str.length; i++) {
      if(!isVowel(str.charAt(i)))
        arrIndex.push(i);
  }

  for(let i = 0; i < arrIndex.length; i++) {
      if(arrIndex[i] + 1 != arrIndex[i + 1]){
          x = i;
          break;
      }
  }
    return x + 1;
}

console.log(translatePigLatin("pant"));
