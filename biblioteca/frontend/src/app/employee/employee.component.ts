import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  public listEmployee:Employee[]

  constructor(private employeeService:EmployeeService) { }

  ngOnInit() {
    this.employeeService.listEmployee().subscribe((data: Employee[]) => {
      this.listEmployee = data;
    })
  }

}
