import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { CallbackComponent } from './components/callback/callback.component';
import { TableComponent } from './components/table/table.component';
import { NewpostComponent } from './components/newpost/newpost.component';
import { SinglegroupComponent } from './components/singlegroup/singlegroup.component';

export const ROUTES: Routes = [
  { path: '', component: HomeComponent },
  { path: 'table', component: TableComponent },
  { path: 'newpost/:id', component: NewpostComponent},
  { path: 'callback', component: CallbackComponent },
  { path: 'groups/:id', component: SinglegroupComponent },
  { path: '**', redirectTo: '' }
];
