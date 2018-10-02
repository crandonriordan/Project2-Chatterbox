// src/app/auth/auth.service.ts
// this service is for auth0 authentication

import { Injectable } from "@angular/core";
import { Router } from "@angular/router";
// import { filter } from "../../../../node_modules/rxjs/operators";
import * as auth0 from "auth0-js";
// import { log } from "util";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UserService } from "../user/user.service";


(window as any).global = window;

@Injectable()
export class AuthService {
  auth0 = new auth0.WebAuth({
    clientID: "BN8OknO8h7QdqNslyAQSJ3p312dsfMj1",
    domain: "project2-jcc.auth0.com",
    responseType: "token id_token",
    redirectUri: "http://localhost:4200",
    scope: "openid profile email read:users user_id id"
  });

  constructor(public router: Router, private http: HttpClient, private user: UserService) { }


  public login(): void {
    this.auth0.authorize();
    console.log(this.isAuthenticated());
    if (this.isAuthenticated()) {
      console.log("running addUser");
      console.log(this.auth0);
      // this.user.addUser({
      //   id: "afej34",
      //   nickname: "Jan",
      //   groups: []
      // });
    }
  }

  public handleAuthentication(): void {
    this.auth0.parseHash((err, authResult) => {
      if (authResult && authResult.accessToken && authResult.idToken) {
        window.location.hash = "";
        this.setSession(authResult);
        this.router.navigate(["/"]);
      } else if (err) {
        this.router.navigate(["/"]);
        console.log(err);
      }
    });
  }

  public logout(): void {
    // Remove tokens and expiry time from localStorage
    localStorage.removeItem('access_token');
    localStorage.removeItem('id_token');
    localStorage.removeItem('expires_at');
    // Go back to the home route
    this.router.navigate(['/']);
  }

  private setSession(authResult): void {
    // Set the time that the Access Token will expire at
    const expiresAt = JSON.stringify(
      authResult.expiresIn * 1000 + new Date().getTime()
    );
    localStorage.setItem("access_token", authResult.accessToken);
    localStorage.setItem("id_token", authResult.idToken);
    localStorage.setItem("expires_at", expiresAt);

  }

  public isAuthenticated(): boolean {
    // Check whether the current time is past the
    // Access Token's expiry time
    const expiresAt = JSON.parse(localStorage.getItem("expires_at") || "{}");
    return new Date().getTime() < expiresAt;
  }

  // ...
  userProfile: any;

  //...
  public getProfile(cb): void {
    const accessToken = localStorage.getItem("access_token");
    if (!accessToken) {
      throw new Error("Access Token must exist to fetch profile");
    }

    const self = this;
    this.auth0.client.userInfo(accessToken, (err, profile) => {
      console.log(profile);
      if (profile) {
        self.userProfile = profile;
        this.user.addUser({
          id: profile.sub,
          nickname: profile.nickname,
          groups: []
        }).subscribe(
          user => {
            console.log("PUT Request is successful ", user);
          },
          error => {
            console.log("Error", error);
          }
        );
      }
      cb(err, profile);
    });
  }
}
