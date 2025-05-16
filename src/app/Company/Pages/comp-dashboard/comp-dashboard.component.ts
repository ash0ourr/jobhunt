import { Component } from '@angular/core';
import {CompHeaderComponent} from "../../Components/comp-header/comp-header.component";
import {CompFooterComponent} from "../../Components/comp-footer/comp-footer.component";

@Component({
  selector: 'app-comp-dashboard',
  standalone: true,
  imports: [
    CompHeaderComponent,
    CompFooterComponent
  ],
  templateUrl: './comp-dashboard.component.html',
  styleUrl: './comp-dashboard.component.css'
})
export class CompDashboardComponent {

}
