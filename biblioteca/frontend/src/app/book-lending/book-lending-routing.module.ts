import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookLendingComponent } from './book-lending.component';

const routes: Routes = [
  { 
    path: '',
    component: BookLendingComponent
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BookLendingRoutingModule { }
