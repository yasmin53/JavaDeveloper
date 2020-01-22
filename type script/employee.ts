export class Employee{
    id:number;
    name:string;
    dob:Date;
    age:number;
    emailid:string
   constructor(id:number,name:string,dob:Date,age:number,emailid:string){
this.id=id;
this.name=name;
this.dob=dob;
this.age=age;
this.emailid=emailid;
   }
}

let employee= new Employee(121,'yasmin',new Date(),21,'zubduma@gmail.com');
console.log(employee);
//console.log('date od birth' +employee.dob);
