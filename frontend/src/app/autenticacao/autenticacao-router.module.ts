import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';


export const routes: Routes = [{
  path: 'autenticacao',
  children: [{
    path: 'login',
    component: LoginComponent
  }]
}]

@NgModule({
  exports: [RouterModule],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class AutenticacaoRouterModule { }
