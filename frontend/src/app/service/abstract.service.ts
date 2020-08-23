import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { StorageService } from './storage.service';
@Injectable({
  providedIn: 'root'
})
export class AbstractService {

  url: string = 'http://localhost:8080/siga';
  headers: HttpHeaders = new HttpHeaders({
    'Access-Control-Allow-Origin': '*',
    'Content-Type': 'application/x-www-form-urlencoded',
    Authorization: 'Basic Y2xpZW50LWlkOnNlY3JldC1pZA==',
    client_id: 'client-id',
    client_secret: 'secret-id'
  });


  constructor(
    public storage: StorageService
  ) { 
    
  }

  getAccessToken(){
    let tokenHttpHeaders =  new HttpHeaders({
      Authorization : 'Bearer ' + this.storage.getFromLocalStorage('access_token')
    });
    return tokenHttpHeaders;
  }
}
