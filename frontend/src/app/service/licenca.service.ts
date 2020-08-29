import { Injectable } from '@angular/core';
import { AbstractService } from './abstract.service';
import { StorageService } from './storage.service';

@Injectable({
  providedIn: 'root'
})
export class LicencaService extends AbstractService{

  constructor(public storage: StorageService) { 
    super(storage);
  }

  salvar(licenca: Licenca){

  }
}
