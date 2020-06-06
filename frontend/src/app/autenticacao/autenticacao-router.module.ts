import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { RecuperacaoSenhaComponent } from './recuperacao-senha/recuperacao-senha.component';


export const routes: Routes = [{
  path: 'autenticacao',
  children: [{
    path: 'login',
    component: LoginComponent
  },{
    path: 'recuperacao-senha',
    component: RecuperacaoSenhaComponent
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
