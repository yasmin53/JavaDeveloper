import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RegisterComponent} from './user/register/register.component';
import { UsersComponent } from './users/users.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';

import { PipeComponent } from './pipes/pipe/pipe.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path:'register',component: RegisterComponent },
  {path:'users',component:UsersComponent},
 
  {path:'update-user',component:UpdateUserComponent},
  // {path:'pipes',component:PipeComponent},



  {path:'**',component:HomeComponent},


  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
