import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { 
    path: 'home',
    loadChildren: './home/home.module#HomeModule'
  },
  { 
    path: 'employee',
    loadChildren: './employee/employee.module#EmployeeModule'
  },
  { 
    path: 'student',
    loadChildren: './student/student.module#StudentModule'
  },
  { 
    path: 'book-lending',
    loadChildren: './book-lending/book-lending.module#BookLendingModule'
  },
  { 
    path: 'book-search',
    loadChildren: './book-search/book-search.module#BookSearchModule'
  },
  { path: '', pathMatch: 'full', redirectTo: '/home' }
]

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
