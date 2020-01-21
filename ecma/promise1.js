//var promise = new Promise(function(resolve, reject) {
 //   setTimeout(resolve,5000)
//})
 //promise.then(function()
 //{
   //  console.log('this is done');
 //})



 //var asynchronousFunction=function(){
  //  return new  Promise(function(resolve,reject)
   // {
     //   console.log("keep every you male and only make promises that you can keep");
       // setTimeout(resolve,5000);
//    })
//}
//asynchronousFunction()
//.then(asynchronousFunction)
//.then(asynchronousFunction)
    

const myPromise=new Promise((resolve,reject) => {
    if(Math.random()*100<=50){
        resolve('hello,promise');
 }
 reject(new Error('in 10% of the case,i failed successfully'));
});

const onResolved=(resolveValue) => console.log(resolveValue);
const onRejected=(error) =>console.log(error);

myPromise.then(onResolved,onRejected);
