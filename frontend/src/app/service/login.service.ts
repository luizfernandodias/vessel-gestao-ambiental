import { Injectable } from '@angular/core';
import { AbstractService } from './abstract.service';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService extends AbstractService{

  constructor(
    private http: HttpClient
  ) {
    super();
   }

   login(username: string, password: string) {
    return this.http.post(
      this.url + '/oauth/token',
      {
        username: username,
        password: password
      },
      {
        headers: this.headers
      }
      ).toPromise().then((result) => {
        console.log(result);
      });
  }
}
