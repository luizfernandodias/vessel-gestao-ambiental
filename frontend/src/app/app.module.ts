import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AutenticacaoModule } from './autenticacao/autenticacao.module';
import { HttpClientModule } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { StorageServiceModule } from 'angular-webstorage-service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AutenticacaoModule,
    HttpClientModule,
    StorageServiceModule
  ],
  providers: [
    HttpClientModule,
    FormBuilder,
    Storage
  ],
  exports: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
