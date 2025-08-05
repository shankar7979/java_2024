import { Component, Input } from '@angular/core';
import { Employee } from './model/employee';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employee',
  imports: [CommonModule,FormsModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent1 {

 @Input() emp:Employee;
  constructor(){
    this.emp=new Employee();
  }

}
