var prompt = require("prompt-sync")();

while (true) {
  let input = prompt("");
  let num = parseInt(input);
  if (!isNaN(num)) {
    // 숫자인지 먼저 확인
    if (num > 0) {
      // 숫자라면 양수인지 확인
      console.log((num * (num + 1)) / 2);
      break;
    } else {
      console.log("X");
    }
  } else {
    console.log("X");
  }
}
