import { TestBed } from '@angular/core/testing';

import { TipoCondicionanteService } from './tipo-condicionante.service';

describe('TipoCondicionanteService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TipoCondicionanteService = TestBed.get(TipoCondicionanteService);
    expect(service).toBeTruthy();
  });
});
