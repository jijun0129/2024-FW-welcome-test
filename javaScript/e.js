var prompt = require("prompt-sync")();

let year = prompt("");
let month = prompt("");

if (month == 2) {
  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    console.log("29");
  } else {
    console.log("28");
  }
} else if (month == 4 || month == 6 || month == 9 || month == 11) {
  console.log("30");
} else {
  console.log("31");
}
