var prompt = require("prompt-sync")();

let input = prompt("");
let reverseNum = parseInt(input.split("").reverse().join(""));

console.log(reverseNum);
