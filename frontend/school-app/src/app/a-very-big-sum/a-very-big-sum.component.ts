import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-a-very-big-sum',
  templateUrl: './a-very-big-sum.component.html',
  styleUrls: ['./a-very-big-sum.component.css']
})
export class AVeryBigSumComponent implements OnInit {

  size = new FormControl('');
  values = new FormControl('');
  result:string;

  constructor() { }

  ngOnInit() {
  }

  aVeryBigSum() {
    const ar = this.values.value.split(' ').map(arTemp => parseInt(arTemp, 10));
    let outputText = '\n Input array: ' + ar + '\n';

    let sum = 0;

    for (let i = 0; i < ar.length; i++) {
      if (!isNaN(ar[i])) {
        sum = sum + ar[i];
      }
    }

    this.result = outputText + '\n Sum: ' + sum;
  }

}
