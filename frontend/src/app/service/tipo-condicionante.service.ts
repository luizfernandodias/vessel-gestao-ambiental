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
    const body = new HttpParams()
    .set('descricao', tipoCondicionante.descricao)
    .set('username', this.storage.getFromLocalStorage('username'))
    .set('password', this.storage.getFromLocalStorage('password'));

    console.log('chamando a função');

    return this.http.post(
      this.url + '/tipo-condicionante/salvar',
      body,
      {headers: this.getAccessToken()}
    );
  }

}
