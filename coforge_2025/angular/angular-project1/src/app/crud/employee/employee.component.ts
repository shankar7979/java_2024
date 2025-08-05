import { Component, Input } from '@angular/core';
import { Employee } from './model/employee';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employee1',
  imports: [CommonModule,FormsModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent1 {
  myclock:string="";
 @Input() emp:Employee;
  constructor(){
    this.emp=new Employee();
  }

  ngOnInit(): void {
   console.log(" ng on init called  ") 
   this.clock;
  }

 clock= setInterval(() => {
  this.myclock=new Date().toLocaleTimeString()
}, 1000);

  ngOnDestroy(): void {
    console.log("ng destroy called ")
  }


}
