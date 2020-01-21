var arrays= new Array(10);
for(var i=0;i<arrays.length;i++){
    arrays[i]=Math.floor(Math.random()*100);
}
console.log(arrays);
var result=arrays.filter((number) => number%2==0 && number%5==0); 
console.log(result);