import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AVeryBigSumComponent } from './a-very-big-sum.component';

describe('AVeryBigSumComponent', () => {
  let component: AVeryBigSumComponent;
  let fixture: ComponentFixture<AVeryBigSumComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AVeryBigSumComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AVeryBigSumComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
