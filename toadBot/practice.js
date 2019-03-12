

let greaterThan = function(passed){

    let comparator = function (inner){
        return inner > passed;
    }
    return comparator;
}

let multiplier = function(x){

    let factor = function(n){
        return x * n;
    }
    return factor;
}

let greaterThan2 = greaterThan(2);
console.log(greaterThan2(4));