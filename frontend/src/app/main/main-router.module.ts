import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastrarUsuarioComponent } from './cadastrar-usuario/cadastrar-usuario.component';
import { CadastrarLicencaComponent } from './cadastrar-licenca/cadastrar-licenca.component';

export const routes: Routes = [{
  path: 'main',
  children: [
    {
      path: 'create-usuario',
      component: CadastrarUsuarioComponent
    },
    {
      path: 'cadastrar-licenca',
      component: CadastrarLicencaComponent
    }
  ]
}]

@NgModule({
  exports: [
    RouterModule
  ],
  imports: [
    RouterModule.forRoot(routes)
  ]
})
export class MainRouterModule { }
