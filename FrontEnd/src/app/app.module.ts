import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http'; 

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';

import { ROUTES } from './app.routes';

import { ProfileService } from './services/profile/profile.service';
import { UserService } from './services/user/user.service';
import { GroupService } from './services/group/group.service';

import { AuthService } from './services/auth/auth.service';
import { PostService } from './services/post/post.service';
import { CallbackComponent } from './components/callback/callback.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { TableComponent } from './components/table/table.component';
import { PaginationComponent } from './components/pagination/pagination.component';

import {DataTableModule} from "angular-6-datatable";
import { PosttableComponent } from './components/posttable/posttable.component';
import { NewpostComponent } from './components/newpost/newpost.component';
import { ProfileComponent } from './components/profile/profile.component';
import { SinglegroupComponent } from './components/singlegroup/singlegroup.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CallbackComponent,
    NavbarComponent,
    TableComponent,
    PaginationComponent,
    PosttableComponent,
    NewpostComponent,
    ProfileComponent,
    SinglegroupComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    HttpClientModule,
    DataTableModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [AuthService, PostService, ProfileService, UserService, GroupService],
  bootstrap: [AppComponent]
})
export class AppModule { }
