//get all jokes from the web api at http://localhost:8080/api/v1/jokes
let uri = "http://localhost:8080/api/v1/jokes";
let params = {
    method: "get",
    mode: "cors",
    headers: {
        "Content-Type": "application/json"
    }
};

fetch(uri, params)
    .then(function(response) {
        console.log(response);
        return response.json(); //return another promise
    })
    .then(function(json) {
        console.log(json);
    });

