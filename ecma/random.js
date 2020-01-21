 var arrays=new Array(10);

for( var index=0;index<=arrays.length;index++)
{
    arrays[index]=Math.floor(Math.random()*100);
}
let div=arrays.filter((x)=> x%2==0 && x%5==0);
console.log(div);



//let inc=arr.map((x)=>parseInt(x*1.1))
