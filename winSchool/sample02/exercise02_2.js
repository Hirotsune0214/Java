let s = "data[123]";

let start = s.indexOf("[");
console.log(start);

let end = s.indexOf("]");
console.log(end);

console.log(s.substring(start + 1 , end));