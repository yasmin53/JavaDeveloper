import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

  getTodayDate()
  {
    return new Date();
  }

  sendinfo()
  {
    return
  }
}
