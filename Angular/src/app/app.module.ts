import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './user/register/register.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ExampleComponent } from './example/example.component';
import { UserService } from './services/user.service';
import { UsersComponent } from './users/users.component';
import { HttpClientModule} from '@angular/common/http';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { PipeComponent } from './pipes/pipe/pipe.component';
import { CustomepipePipe } from './customepipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,

    HomeComponent,
    ExampleComponent,
    UsersComponent,
    UpdateUserComponent,
    PipeComponent,
    CustomepipePipe,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
