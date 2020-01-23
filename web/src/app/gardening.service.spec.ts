import { TestBed } from '@angular/core/testing';

import { GardeningService } from './gardening.service';

describe('GardeningService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GardeningService = TestBed.get(GardeningService);
    expect(service).toBeTruthy();
  });
});
