let sum = 0;
for(let i = 1; i < 10; i++){
  if(i % 2 == 1){
    sum += i;
    console.log(sum);
  }
  //console.log(sum); こっちだと結果が2重に表示される
}