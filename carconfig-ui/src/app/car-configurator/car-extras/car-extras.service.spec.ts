import { TestBed } from '@angular/core/testing';

import { CarExtrasService } from './car-extras.service';

describe('CarExtrasService', () => {
  let service: CarExtrasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CarExtrasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
