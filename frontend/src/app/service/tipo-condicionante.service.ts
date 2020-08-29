import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { AbstractService } from './abstract.service';
import { TipoCondicionante } from '../model/tipoCondicionante';
import { StorageService } from './storage.service';

@Injectable({
  providedIn: 'root'
})
export class TipoCondicionanteService extends AbstractService{

  constructor(
    private http: HttpClient,
    public storage: StorageService
  ) {
    super(storage);
   }

  salvar(tipoCondicionante: TipoCondicionante) {

    return this.http.post(
      this.url + '/tipo-condicionante/salvar',
      JSON.stringify({
        descricao: tipoCondicionante.descricao,
        username: this.storage.getFromLocalStorage('username'),
        password: this.storage.getFromLocalStorage('password')
      }),
      {headers: this.getDefaultHeaders()}
    );
  }

}
