var prompt = require("prompt-sync")();

let age = prompt("");
let height = prompt("");

if (age < 14 && height < 160) {
  console.log("O");
} else {
  console.log("X");
}
