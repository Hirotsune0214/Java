let s1 = "abcdefgh";

// 文字列s1の長さ
console.log(s1.length);

// s1に"cd"が含まれるのでtrueを返す
console.log(s1.includes("cd"));

// s1に"cd"が含まれるが先頭ではないのでfalseが返る
console.log(s1.startsWith("cd"));

// s1に含まれる"cd"を"xy"に置き換えた文字列が返される
console.log(s1.replace("cd", "xy"));

// 先頭を0として、4文字目から6文字目「手前」までを取り出す
console.log(s1.substring(4 , 6)); //ef

// 全部大文字にする
console.log(s1.toUpperCase());

let s2 = "123,345,567";
// s2を","で分割する
console.log(s2.split(","));

let s3 = "  space  ";
// s3に含まれている前後の空白を取り除く
console.log(s3.trim());