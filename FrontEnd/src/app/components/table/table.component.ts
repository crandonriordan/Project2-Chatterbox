// this component provides a list of groups with links to each group

import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth/auth.service';
import { GroupService } from '../../services/group/group.service';
import { Group } from '../../group';
import { Router } from '@angular/router';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  groups: Group[] = [];

  constructor(private auth: AuthService, private group: GroupService, private router: Router) { 
  }

  ngOnInit() {
    this
    .group
    .getGroups()
    .subscribe((data) => {
      this.groups = data;
      console.log(this.groups);
  });
  }

  onSubmit(group) {
    this.router.navigate(['/groups', group.name]);
  }

}
