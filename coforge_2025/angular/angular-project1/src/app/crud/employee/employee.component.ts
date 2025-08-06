import { Component, Input } from '@angular/core';
import { Employee } from './model/employee';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { EmployeeService } from '../service/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee1',
  imports: [CommonModule, FormsModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent1 {
  myclock: string = "";
  @Input() emp: Employee;
   emp1: any;
  msg: string = "";
  visible: boolean = false;
  constructor(private service: EmployeeService, private router: Router) {
    this.emp = new Employee();
    this.emp1 = new Employee();
  }

  submit() {
    this.service.addEmployee(this.emp).subscribe(data => {
      this.emp1 = data
      console.log(JSON.stringify(data))
      this.msg="Record Added"
    },
      error => {
        console.log(error)
        this.msg = error.error;
      }
    )
    this.visible = true;
  }

  navigateToALLEmployee() {
    this.router.navigate(['/allemployee']);
  }

  ngOnInit(): void {
    console.log(" ng on init called  ")
    this.clock;
  }

  clock = setInterval(() => {
    this.myclock = new Date().toLocaleTimeString()
  }, 1000);

  ngOnDestroy(): void {
    console.log("ng destroy called ")
  }

}
