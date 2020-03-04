import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BookLendingComponent } from './book-lending.component';
import { BookLendingRoutingModule } from './book-lending-routing.module';

@NgModule({
  declarations: [BookLendingComponent],
  imports: [
    CommonModule,
    BookLendingRoutingModule
  ]
})
export class BookLendingModule { }
