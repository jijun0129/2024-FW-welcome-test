var prompt = require("prompt-sync")();

let input = prompt("").split(" ");
let students = ["A", "B", "C"];

let markTimeList = students
  .map((name, index) => {
    //map을 이용해 이름과 시간을 가지는 객체 배열 생성
    return { name: name, time: input[index] };
  })
  .sort((x, y) => x.time - y.time); // 오름차순 정렬

markTimeList.forEach((student, index) => {
  setTimeout(() => {
    // 첫번째 학생부터 순서대로 마킹 후 종료
    console.log(`${student.name} 마킹`);
    if (index == 2) {
      console.log("시험이 종료되었습니다. ");
    }
  }, student.time * 1000);
});
