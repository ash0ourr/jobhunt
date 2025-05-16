import { Routes } from '@angular/router';
import {HomeComponent} from "./User/Pages/home/home.component";
import  {CompDashboardComponent} from "./Company/Pages/comp-dashboard/comp-dashboard.component" ;

export const routes: Routes = [
  {
    path : '' ,
    component : HomeComponent ,
    title : 'Job Hunt /Home'
  },
  {
    path : 'company-dashboard' ,
    component : CompDashboardComponent ,
    title : 'Job Hunt /Company-Dashboard'
  },




];
