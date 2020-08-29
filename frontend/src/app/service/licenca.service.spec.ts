import { TestBed } from '@angular/core/testing';

import { LicencaService } from './licenca.service';

describe('LicencaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LicencaService = TestBed.get(LicencaService);
    expect(service).toBeTruthy();
  });
});
