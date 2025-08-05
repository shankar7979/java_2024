import { Component } from '@angular/core';
import { EmployeeService } from '../service/employee.service';
import { Observable } from 'rxjs';
import { Employee } from '../employee/model/employee';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-allemployee',
  imports: [CommonModule,FormsModule],
  templateUrl: './allemployee.component.html',
  styleUrl: './allemployee.component.css'
})
export class AllemployeeComponent {

    emplist:Observable<Employee[]>;

  constructor(private service:EmployeeService ){
    this.emplist=service.getAllEmployee();
  }

}
