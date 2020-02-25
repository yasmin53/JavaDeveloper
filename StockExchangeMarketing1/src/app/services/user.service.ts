import { Injectable, Inject } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import{User} from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl = ' http://localhost:8080/user/';
   
  constructor(private httpClient: HttpClient,@Inject(HttpClient) private ht) { }
  getAllUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.httpUrl);
  }

  saveUser(user:User):Observable<User>{
    return this.ht.post(this.httpUrl, user);
  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(`http://localhost:8080/user/${id}`);
  }
  updateUserInfo(user :User):Observable<User>{
    return this.ht.put(`http://localhost:8080/user` , user);
  }
  getUserById(id :number):Observable<User>{
    return this.ht.get(`http://localhost:8080/user/${id}`);
  }
}