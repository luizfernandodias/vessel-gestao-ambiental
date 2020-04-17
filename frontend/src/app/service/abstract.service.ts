import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AbstractService {

  url: string = 'http://localhost:8080/siga';
  headers: HttpHeaders = new HttpHeaders({
    'Access-Control-Allow-Origin': '*',
    'Content-Type': 'application/x-www-form-urlencoded',
    Authorization: 'Basic Y2xpZW50ZTpjbGllbnRl',
    client_id: 'cliente',
    client_secret: 'cliente'
  });

  constructor(
  ) { }

  
}
