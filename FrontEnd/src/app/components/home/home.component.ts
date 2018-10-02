// this component provides the home screen

import { Component, OnInit } from '@angular/core';
import { AuthService } from './../../services/auth/auth.service';
import { UserService } from '../../services/user/user.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  profile: any;
  constructor(private auth: AuthService, private user: UserService) { }

  ngOnInit() {
  
  }

  ngOnChanges() {
    if (this.auth.userProfile) {
      this.profile = this.auth.userProfile;
      this.user.addUser({
        id: this.profile.sub,
        nickname: this.profile.nickname,
        groups: []
      }).subscribe(
        user => {
            console.log("ngOnChanges PUT Request is successful ", user);
        },
        error => {
            console.log("Error", error);
        }
    );
    } else {
      this.auth.getProfile((err, profile) => {
        console.log(profile);
        this.profile = profile;
        this.user.addUser({
          id: this.profile.sub,
          nickname: this.profile.nickname,
          groups: []
        }).subscribe(
          user => {
              console.log("ngOnChanges PUT Request is successful ", user);
          },
          error => {
              console.log("Error", error);
          }
      );
      });
    }
  }
}
