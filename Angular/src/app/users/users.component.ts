import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import {User} from '../models/user';
import { Observable } from 'rxjs';
import { UpdateUserComponent } from '../user/update-user/update-user.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  httpClient: any;
  httpUrl: any;

  constructor(private userService:UserService,private router:Router) { }
users:User[];
  ngOnInit() {
//this.users=this.userService.getAllUsers();
this.userService.getAllUsers().subscribe(data => {
this.users=data;
});
}
// deleteUser(user: User) {
  // this.userService.deleteUser(user.id).subscribe();
  // this.users=this.users.filter(u=>u!==user);

// }
// }

// updateUser(user:User) {
//   localStorage.removeItem('UserId');
//   localStorage.setItem('UserId',user.id.toString());
//   this.router.navigate(['update-user']);
  
// }
// }




  
}
