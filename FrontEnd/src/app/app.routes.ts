import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { CallbackComponent } from './components/callback/callback.component';
import { TableComponent } from './components/table/table.component';
import { NewpostComponent } from './components/newpost/newpost.component';

export const ROUTES: Routes = [
  { path: '', component: HomeComponent },
  { path: 'table', component: TableComponent },
  { path: 'newpost', component: NewpostComponent},
  { path: 'callback', component: CallbackComponent },
  { path: '**', redirectTo: '' }
];
