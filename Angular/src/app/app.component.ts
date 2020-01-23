import { Component } from '@angular/core';
import { User } from './models/user';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'stock market';
  user= new User(101,'yasmin','zubduma@gmail.com',9989777);

  callme()
  {
    alert('Welcome:'+ this.user.name);
  }
}
