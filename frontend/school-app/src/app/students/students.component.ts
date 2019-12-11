import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { StudentsService } from './students.service';
import { StudentDTO } from './student.dto';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css'],
  providers: [StudentsService]
})
export class StudentsComponent implements OnInit {

  formGroup = new FormGroup({
    name: new FormControl(''),
    dateOfBirth: new FormControl(''),
    documentNumber: new FormControl(''),
  });

  constructor(private studentsService: StudentsService) {
  }

  ngOnInit() {
  }

  onSubmit() {
    let dto = new StudentDTO();
    dto.name = this.formGroup.controls['name'].value;
    dto.dateOfBirth = this.formGroup.controls['dateOfBirth'].value;
    dto.documentNumber = this.formGroup.controls['documentNumber'].value;

    this.studentsService.addStudent(dto).subscribe((response:any) => {
      debugger;
      console.log(response);
    });
  }

}
