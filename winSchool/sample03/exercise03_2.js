let english = 30, japanese = 40;

if(english >= 70 && japanese >= 70){
  console.log("合格です。");
} else if(english >= 70 || japanese >= 70){
  console.log("補欠合格です。");
} else {
  console.log("不合格です。");
}