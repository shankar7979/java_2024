import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import Employee from './model/employee';

@Component({
  selector: 'app-employee',
  imports: [CommonModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {
    emp:Employee;
    emp1:Employee[];
    src1:string="assets/emp.jpg";
    width1:number=200;
    height1:number=150;

    hello(){
      alert("hello called ")
    }


     constructor(){
      this.emp=new Employee();
       this.emp1=[
           {"id":100001,"name":"suresh kumar","salary":780000},
           {"id":100002,"name":"arvind kumar","salary":180000},
           {"id":100003,"name":"dilip kumar","salary":210000},
           {"id":100004,"name":"dhiraj kumar","salary":310000},
           {"id":100005,"name":"pargati kumar","salary":560000},
           {"id":100006,"name":"jai kumar","salary":310000},
       ] 
    }
}
