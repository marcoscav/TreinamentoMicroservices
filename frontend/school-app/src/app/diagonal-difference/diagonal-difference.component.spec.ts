import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DiagonalDifferenceComponent } from './diagonal-difference.component';

describe('DiagonalDifferenceComponent', () => {
  let component: DiagonalDifferenceComponent;
  let fixture: ComponentFixture<DiagonalDifferenceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiagonalDifferenceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiagonalDifferenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
