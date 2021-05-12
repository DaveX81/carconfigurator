import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarExtrasComponent } from './car-extras.component';

describe('CarExtrasComponent', () => {
  let component: CarExtrasComponent;
  let fixture: ComponentFixture<CarExtrasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarExtrasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarExtrasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
