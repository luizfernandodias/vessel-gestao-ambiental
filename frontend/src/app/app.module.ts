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
import { OAuthService, UrlHelperService, OAuthLogger, OAuthModule } from 'angular-oauth2-oidc';
import { RecuperacaoSenhaComponent } from './autenticacao/recuperacao-senha/recuperacao-senha.component';


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
    MatButtonModule,
    OAuthModule.forRoot()
  ],
  providers: [
    HttpClientModule,
    FormBuilder,
    Storage,
    OAuthService,
    UrlHelperService
  ],
  exports: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
