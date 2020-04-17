import { Injectable, Inject } from '@angular/core';
import { LOCAL_STORAGE, WebStorageService } from 'angular-webstorage-service';

@Injectable({
  providedIn: 'root'
})
export class StorageService {

  constructor(
        @Inject(LOCAL_STORAGE) private storage: WebStorageService
  ) { }

  public storeOnLocalStorage(key: string, object: any): void {
    this.storage.set(key, object);
  }

  public getFromLocalStorage(key: string): any {
    return this.storage.get(key);
  }
}
