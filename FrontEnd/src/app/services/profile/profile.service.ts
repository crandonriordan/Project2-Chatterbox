// this service returns a user profile

import { Injectable } from '@angular/core';
import { AuthService} from '../auth/auth.service';

@Injectable()
export class ProfileService {

  profile: any;

  constructor(private auth: AuthService) { 
    if (this.auth.userProfile) {
      this.profile = this.auth.userProfile;
    } else {
      this.auth.getProfile((err, profile)=> {
        console.log(profile);
        this.profile = profile;
      })
    }
    console.log(this.profile);
  }

  ngOnInit() {
    
  }
  
  getProfile() {
    // console.log(this.profile);
    return this.profile;
  }

}
