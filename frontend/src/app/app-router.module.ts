import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './autenticacao/login/login.component';
import { CommonModule } from '@angular/common';
import { CreateUsuarioComponent } from './main/create-usuario/create-usuario.component';

export const routes: Routes = [
    { path: '', component: LoginComponent },
    { path: 'main', children: [{
      path: 'create-usuario', component: CreateUsuarioComponent
    }]}
]

@NgModule({
  exports: [RouterModule],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class AppRouterModule { }
