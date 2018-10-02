// this component provides a list of posts

import { Component, OnInit } from '@angular/core';
import { PostService } from '../../services/post/post.service';
import { Post } from '../../post';

@Component({
  selector: 'app-posttable',
  templateUrl: './posttable.component.html',
  styleUrls: ['./posttable.component.css']
})
export class PosttableComponent implements OnInit {

  posts: Post[] = [];
  
  constructor(private postService: PostService) { }

  ngOnInit() {
  //   this
  //   .postService
  //   .getPostsByGroup()
  //   .subscribe((data) => {
  //     this.posts = data;
  // });
  }
}
