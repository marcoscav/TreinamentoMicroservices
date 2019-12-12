import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AVeryBigSumComponent } from './a-very-big-sum/a-very-big-sum.component';
import { DiagonalDifferenceComponent } from './diagonal-difference/diagonal-difference.component';

const routes: Routes = [
  { path: 'a-very-big-sum', component: AVeryBigSumComponent },
  { path: 'diagonal-difference', component: DiagonalDifferenceComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
