import { TestBed } from '@angular/core/testing';

import { CarPaintingService } from './car-painting.service';

describe('CarPaintingService', () => {
  let service: CarPaintingService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CarPaintingService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
