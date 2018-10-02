// this service gets the current user, and adds new users to the database

import { Injectable } from '@angular/core';
import { AuthService} from '../auth/auth.service';
import { HttpClient } from '@angular/common/http';
import { User } from '../../user';
import { Observable } from 'rxjs/Observable';


@Injectable()
export class UserService {

  public user: any;
  url = "http://ec2-54-152-253-227.compute-1.amazonaws.com:8080/project2/api/users";
  constructor(private http: HttpClient) { 

  }

  getUser(id: String): Promise<User>{
    return this.http.get<User>(this.url+"/"+id)
      .toPromise();
  }

  addUser (user: User): Observable<User> {
    console.log("running addUser from user.service.ts");
    return this.http.post<User>(this.url, user);
  }
}
