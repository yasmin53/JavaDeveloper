import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, EmailValidator } from '@angular/forms';
import { componentFactoryName } from '@angular/compiler';
import {UserService} from 'src/app/services/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerUser:FormGroup;

  constructor( private formBuilder: FormBuilder,private userService:UserService) { }

  ngOnInit() {
    this.registerUser = this.formBuilder.group({
id: ['',Validators.required],
name: ['',Validators.required],
email: ['',[Validators.required,Validators.email]],
phone:['',Validators.required]



  });
}

addUser() {
this.userService.saveUser(this.registerUser.value).subscribe(data =>
  {
    console.log('successfully inserted' + data);
  
  });
}
onSubmit() {
  console.log(this.registerUser.value);
}

  }


