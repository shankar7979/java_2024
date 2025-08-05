import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { EmployeeComponent } from './employee/employee.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { EmployeeComponent1 } from './crud/employee/employee.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,EmployeeComponent,
     CalculatorComponent,EmployeeComponent1,
      RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // title = 'my-angular-app';
  // age:number=29;
  // name:string="ram kumar";
}
