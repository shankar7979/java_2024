import { Routes } from '@angular/router';
import { EmployeeComponent1 } from './crud/employee/employee.component';
import { CalculatorComponent } from './calculator/calculator.component';

export const routes: Routes = [
  {path:'',component:EmployeeComponent1},
  {path:'calculator',component:CalculatorComponent},
  {path:'employee',component:EmployeeComponent1},

];

