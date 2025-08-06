import { Component } from '@angular/core';
import { EmployeeService } from '../service/employee.service';
import { catchError, Observable } from 'rxjs';
import { Employee } from '../employee/model/employee';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-allemployee',
  imports: [CommonModule, FormsModule],
  templateUrl: './allemployee.component.html',
  styleUrl: './allemployee.component.css'
})
export class AllemployeeComponent {
  msg: string = "";
  emplist: Observable<Employee[]>;

  constructor(private service: EmployeeService) {
    this.emplist=service.getAllEmployee();
  }
}
