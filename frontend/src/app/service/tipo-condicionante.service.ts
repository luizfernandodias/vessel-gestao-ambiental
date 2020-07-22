import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { AbstractService } from './abstract.service';
import { StorageService } from 'angular-webstorage-service';
import { TipoCondicionante } from '../model/tipoCondicionante';

@Injectable({
  providedIn: 'root'
})
export class TipoCondicionanteService extends AbstractService{

  constructor(
    private http: HttpClient
  ) {
    super();
   }

  salvar(tipoCondicionante: TipoCondicionante) {
    const body = new HttpParams()
    .set('descricao', tipoCondicionante.descricao)
    .set('observacao',tipoCondicionante.descricao);

    console.log(this.url + '/tipo-condicionante/salvar');

    return this.http.post(
      this.url + '/tipo-condicionante/salvar',
      body,
      {headers: this.headers}
    )
  }

}
