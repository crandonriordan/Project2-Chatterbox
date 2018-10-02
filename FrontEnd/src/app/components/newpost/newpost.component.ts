// This component contains the "new post" form

import { Component, OnInit } from '@angular/core';
import { PostService } from '../../services/post/post.service';
import { Post } from '../../post';
import { ProfileService} from '../../services/profile/profile.service';
import { AuthService } from '../../services/auth/auth.service';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-newpost',
  templateUrl: './newpost.component.html',
  styleUrls: ['./newpost.component.css']
})
export class NewpostComponent implements OnInit {

  private title: String;
  private content: String;
  private profile: any;
  private groupName: String;
  private post: Post;

  constructor(private auth: AuthService, private route: ActivatedRoute, private postService: PostService, private router: Router, private profileService: ProfileService) {
    this.profile = this.profileService.getProfile();
   }

  ngOnInit() {
    let name = this.route.snapshot.paramMap.get('id');
    this.groupName = name;
    console.log(this.groupName);
  }

  onSubmit(){ 
    console.log(this.title);
    console.log(this.content);
    // let name = this.route.snapshot.paramMap.get('id');
    // this.groupName = name;
    // console.log(this.groupName);
    this.post = {
      id: 0,
      title: this.title,
      content: this.content, 
      imageUrl: null,
      user: {
        id: this.auth.userProfile.id,
        nickname: this.auth.userProfile.nickname,
        groups: []
      },
      group: {
        id: 0,
        name: this.groupName,
        users: []
      },
      votes: [],
      comments: []
    };
    this.postService.newPost(this.groupName, this.post);
    console.log("Onsubmit method called");
    this.router.navigate(['/groups', this.groupName]);
  }

}
