import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AutenticacaoModule } from './autenticacao/autenticacao.module';
import { HttpClientModule } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { StorageServiceModule } from 'angular-webstorage-service';
import { AppRouterModule } from './app-router.module';
import { MainModule } from './main/main.module';
import { RouterModule } from '@angular/router';
import { MatIconModule, MatToolbarModule, MatMenuModule, MatButtonModule } from '@angular/material';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AutenticacaoModule,
    HttpClientModule,
    StorageServiceModule,
    MainModule,
    RouterModule,
    AppRouterModule,
    MatIconModule,
    MatToolbarModule,
    MatMenuModule,
    MatButtonModule
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
