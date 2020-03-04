import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BookSearchComponent } from './book-search.component';
import { BookSearchRoutingModule } from './book-search-routing.module';

@NgModule({
  declarations: [BookSearchComponent],
  imports: [
    CommonModule,
    BookSearchRoutingModule
  ]
})
export class BookSearchModule { }
