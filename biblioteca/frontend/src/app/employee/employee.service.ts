import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private configUrl:string = 'http://localhost:8200';

  private listEmployeeUrl:string = '/list-employee';

  constructor(private http:HttpClient) { }

  getConfig() {
    return this.http.get(this.configUrl);
  }

  addEmployee(employee:Employee) {

  }

  listEmployee() {
    let url = this.configUrl + this.listEmployeeUrl
    return this.http.get(url)
  }
}
