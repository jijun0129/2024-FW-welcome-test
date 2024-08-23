var prompt = require("prompt-sync")();

let char = prompt("");
let aeiou = ["a", "e", "i", "o", "u"];

let i = 0;
for (i = 0; i < 5; i++) {
  if (char == aeiou[i]) {
    console.log("O");
    break;
  }
}
if (i == 5) {
  console.log("X");
}
