// this service gets posts by group. the newPost function is not yet functional.

import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Post } from '../../post';
import { Observable } from 'rxjs/Observable';
import { BrowserModule } from '@angular/platform-browser';

@Injectable()
export class PostService {

  constructor(private http: HttpClient) { }

  newPost(groupName: String, post: Post): any {
    console.log(post);
    var data = JSON.stringify({
      "id": 0,
      "title": post.title,
      "content": post.content,
      "imageUrl": null,
      "user": {
        "id": "ggl-124",
        "nickname": "bob1",
        "groups": []
      },
      "group": {
        "id": 1,
        "name": post.group.name,
        "users": []
      },
      "votes": [],
      "comments": []
    });

    var xhr = new XMLHttpRequest();
    xhr.withCredentials = true;

    xhr.addEventListener("readystatechange", function () {
      if (this.readyState === 4 && this.status == 200) {
        console.log(this.responseText);
      }
    });

    xhr.open("POST", "http://ec2-54-152-253-227.compute-1.amazonaws.com:8080/project2/api/groups/TheOfficeFanFiction/posts");
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.setRequestHeader("Cache-Control", "no-cache");
    xhr.setRequestHeader("Postman-Token", "b04ae0b9-6500-4da4-9985-8f9f97d123c3");

    xhr.send(data);
    // fetch(`http://ec2-54-152-253-227.compute-1.amazonaws.com:8080/project2/api/groups/${groupName}/posts`, {
    //   method: 'POST',
    //   body: JSON.stringify({
    //     "id": post.id,
    //     "title": post.title,
    //     "content": post.content,
    //     "imageUrl": post.imageUrl,
    //     "user": {
    //       "id": post.user.id,
    //       "nickname": post.user.nickname,
    //       "groups": post.user.groups
    //     },
    //     "group": {
    //       "id": post.group.id,
    //       "name": post.group.name,
    //       "users": post.group.users
    //     },
    //     "votes": post.votes,
    //     "comments": post.comments
    //   }),
    //   headers: {
    //     "Content-Type": "application/json",
    //     'Cache-Control': 'no-cache'

    //   },

    // }).then(function (res) { console.log(res) }).then(function (data) { console.log(data) })
  }

  getPostsByGroup(groupName: String): Observable<Post[]> {
    const groupUrl = `http://192.168.61.233:8084/p2-mvc/api/groups/${groupName}/posts`;
    return this.http.get<Post[]>(`${groupUrl}`);
  }


}
