// this component displays all posts for the selected group

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PostService } from '../../services/post/post.service';
import { Post } from '../../post';
import { AuthService } from '../../services/auth/auth.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-singlegroup',
  templateUrl: './singlegroup.component.html',
  styleUrls: ['./singlegroup.component.css']
})
export class SinglegroupComponent implements OnInit {

  name: String;
  posts: Post[];

  constructor(private auth: AuthService, private router: Router, private route: ActivatedRoute, private postService: PostService) {
    let name = this.route.snapshot.paramMap.get('id');
    this.name = name;
  }

  ngOnInit() {
    this.postService.getPostsByGroup(this.name).subscribe((data) => {
      this.posts = data;
    });
  }

  onSubmit() {
    this.router.navigate(['/newpost', this.name]);
  }

}
