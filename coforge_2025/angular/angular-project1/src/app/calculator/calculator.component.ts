import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';

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

  constructor(){
    this.n1=0;
    this.n2=0;
    this.n3=0;
  }

  addition(){
    console.log("n1 "+this.n1)
    console.log("n2 "+this.n1)
    console.log("sum "+this.n3)
    this.n3=this.n1+
    this.n2
    alert("addition is "+this.n3)
  }

}
