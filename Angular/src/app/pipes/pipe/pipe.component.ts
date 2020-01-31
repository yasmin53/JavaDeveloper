 import { Component, OnInit } from '@angular/core';

 @Component({
   selector: 'app-pipe',
   templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
 })
export class PipeComponent implements OnInit {
   message:string;;
  price:number;
   salary:number;
  dob:Date;

   constructor() { }

   ngOnInit() {
     this.message='Today is 30 January 2020';
     this.price=40000;
     this.salary=24000;
     this.dob=new Date(1998,3,24);

   }

}
