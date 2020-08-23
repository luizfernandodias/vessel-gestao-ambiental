import { Injectable } from '@angular/core';
import { AbstractService } from './abstract.service';
import { HttpHeaders, HttpClient, HttpParams } from '@angular/common/http';
import { StorageService } from './storage.service';

@Injectable({
  providedIn: 'root'
})
export class LoginService extends AbstractService{

  constructor(
    private http: HttpClient,
    public storage: StorageService
  ) {
    super(storage);
   }


   login(username: string, password: string) {
    const body = new HttpParams()
    .set('username', username)
    .set('password', password)
    .set('grant_type', 'password');

    return this.http.post(
      this.url + '/oauth/token',
      body,
      {headers: this.headers}
      );
  }

  recuperacaoSenha(email: string) {
    const body = new HttpParams()
    .set('email', email);

    return this.http.post(
      this.url + '/login/recuperar',
      body,
      {headers: this.headers}
    );
  }
}
