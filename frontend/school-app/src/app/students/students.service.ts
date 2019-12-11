import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentDTO } from './student.dto';

@Injectable()
export class StudentsService {
    studentsBaseUrl = 'http://localhost:8200/';

    constructor(private http: HttpClient){

    }

    addStudent(studentDTO: StudentDTO) {
        return this.http.post<StudentDTO>(this.studentsBaseUrl + 'addStudent', studentDTO);
    }
}