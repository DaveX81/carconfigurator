import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarEngineComponent } from './car-engine.component';

describe('CarEngineComponent', () => {
  let component: CarEngineComponent;
  let fixture: ComponentFixture<CarEngineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarEngineComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarEngineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
