import { TestBed } from '@angular/core/testing';

import { CarRimsService } from './car-rims.service';

describe('CarRimsService', () => {
  let service: CarRimsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CarRimsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
