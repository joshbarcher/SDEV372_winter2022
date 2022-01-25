//define a promise that divides two numbers
let division = new Promise(function(success, failure) {
    //code for the executor function goes here...
    let numerator = prompt("Enter a numerator");
    let denominator = prompt("Enter a denominator");

    //convert to numbers (bad inputs result in NaN in the variables)
    numerator = parseInt(numerator);
    denominator = parseInt(denominator);

    //try to show a result
    if (Number.isNaN(numerator) || Number.isNaN(denominator))
    {
        throw "Numerator or denominator is not a number!";
    }
    else if (denominator === 0)
    {
        failure("Cannot divide " + numerator + " by zero");
    }
    else
    {
        //otherwise we can divide!
        success(numerator / denominator);
    }
});

//then we can use our promise
division
    .then(function(result) {
        //the promise was a success
        console.log("Division was successful: " + result);
    })
    .catch(function(exception) {
        console.log("Exception: " + exception.message);
    });

//this might show actions asynchronously
console.log("After the promise is done!");




