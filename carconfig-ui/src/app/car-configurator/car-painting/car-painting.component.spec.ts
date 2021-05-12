import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarPaintingComponent } from './car-painting.component';

describe('CarPaintingComponent', () => {
  let component: CarPaintingComponent;
  let fixture: ComponentFixture<CarPaintingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarPaintingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarPaintingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
