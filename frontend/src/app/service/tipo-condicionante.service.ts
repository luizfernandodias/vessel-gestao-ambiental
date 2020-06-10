import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { AbstractService } from './abstract.service';
import { StorageService } from 'angular-webstorage-service';

@Injectable({
  providedIn: 'root'
})
export class TipoCondicionanteService extends AbstractService{

  constructor(
    private http: HttpClient
  ) {
    super();
   }

  salvar() {
    /*const body = new HttpParams()
    .set('acess_token', this.storage.get('access_token').value)
    .set('token_type', this.storage.get('token_type').value )
    .set('descricao', 'descricao');*/
    return this.http.post(
      this.url + '/tipo-condicionante/salvar',
      null,
      {headers: this.headers}
    )
  }

}
