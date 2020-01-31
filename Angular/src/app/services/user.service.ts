import { Injectable } from '@angular/core';
import {USERS} from'../models/user-mock';
import { HttpClient } from '@angular/common/http';
import {User} from '../models/user';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  
httpUrl='http://localhost:3000/users/';

  users=USERS;

  constructor(private httpClient:HttpClient) { }

  getTodayDate()
  {
    return new Date();
  }
  getAllUsers(): Observable<User[]>

  {

    return this.httpClient.get<User[]>(this.httpUrl);
  }

  saveUser(user:User): Observable<User[]>
  {
    return this.httpClient.post<User[]>(this.httpUrl ,user);
  }

  deleteUser(id:number): Observable<User>
  {
    return this.httpClient.delete<User>(this.httpUrl + id);

  }
  updateUserInfo(user:User): Observable<User>
  {
    return this.httpClient.put<User>(this.httpUrl + user.id,user);
  }

getUserById(id:number): Observable<User> {
  return this.httpClient.get<User>(this.httpUrl+id);
}


  }
