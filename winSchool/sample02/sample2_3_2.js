 let name = "Win太郎";
// console.log("Hello " + name);

let a = 100;
let b = 200;
// 左側から連結されるためTotal 100200と表示される
// console.log("Total " + a + b);
// 正しくはa + bが先に計算されるようにしないといけない
// console.log("Total " + (a + b));

//テンプレート文字列
console.log(`Hello, ${name}さん`);
console.log(`合計: ${a + b}`);
