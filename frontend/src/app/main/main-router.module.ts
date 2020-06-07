import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateUsuarioComponent } from './create-usuario/create-usuario.component';
import { CadastrarLicencaComponent } from './cadastrar-licenca/cadastrar-licenca.component';

export const routes: Routes = [{
  path: 'main',
  children: [
    {
      path: 'create-usuario',
      component: CreateUsuarioComponent
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
