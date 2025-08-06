import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../employee/model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpclient:HttpClient) {

   }
   getAllEmployee():Observable<any>{
    return this.httpclient.get<Employee[]>("http://localhost:9090/employee");
   }

   addEmployee(e:Employee):Observable<Employee>{
    return <Observable<Employee>> this.httpclient.post("http://localhost:9090/employee",e);
   }
}
