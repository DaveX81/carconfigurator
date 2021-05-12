import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarRimsComponent } from './car-rims.component';

describe('CarRimsComponent', () => {
  let component: CarRimsComponent;
  let fixture: ComponentFixture<CarRimsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarRimsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarRimsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
