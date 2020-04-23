import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateUsuarioComponent } from './create-usuario/create-usuario.component';

export const routes: Routes = [{
  path: 'main',
  children: [
    {
      path: 'create-usuario',
      component: CreateUsuarioComponent
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
