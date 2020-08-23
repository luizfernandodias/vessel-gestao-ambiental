import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastrarUsuarioComponent } from './cadastrar-usuario/cadastrar-usuario.component';
import { CadastrarLicencaComponent } from './cadastrar-licenca/cadastrar-licenca.component';
import { CadastrarCondicionanteComponent } from './cadastrar-condicionante/cadastrar-condicionante.component';
import { CadastrarTipoCondicionanteComponent } from './cadastrar-tipo-condicionante/cadastrar-tipo-condicionante.component';
import { SobreOSigaComponent } from './sobre-o-siga/sobre-o-siga.component';

export const routes: Routes = [{
  path: 'main',
  children: [
    {
      path: 'cadastrar-usuario',
      component: CadastrarUsuarioComponent
    },
    {
      path: 'cadastrar-licenca',
      component: CadastrarLicencaComponent
    },
    {
      path: 'cadastrar-condicionante',
      component: CadastrarCondicionanteComponent
    },
    {
      path: 'cadastrar-tipo-condicionante',
      component: CadastrarTipoCondicionanteComponent
    },
    {
      path: 'sobre-o-siga',
      component: SobreOSigaComponent
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
