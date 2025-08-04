import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Customermodel } from './model/CustomerModel';
import { data } from './data/customer';

@Component({
  selector: 'app-calculator',
  imports: [CommonModule,FormsModule],
  templateUrl: './calculator.component.html',
  styleUrl: './calculator.component.css'
})
export class CalculatorComponent {

@Input()  n1:number;
@Input()  n2:number;
@Input()  n3:number;

customer1:Customermodel[];

  constructor(){
    this.n1=0;
    this.n2=0;
    this.n3=0;
    this.customer1=data;
  }

  addition(){
    this.n3=this.n1+
    this.n2
  }
  subtraction(){
    this.n3=this.n1-
    this.n2
  }
  multiplication(){
    this.n3=this.n1*
    this.n2
  }
  division(){
    this.n3=this.n1/
    this.n2
  }

}
