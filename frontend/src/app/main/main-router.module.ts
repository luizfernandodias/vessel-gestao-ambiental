import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { CreateUsuarioComponent } from './create-usuario/create-usuario.component';

export const routes: Routes = [{
  path: 'main',
  children: [{
  path: 'create-usuario', component: CreateUsuarioComponent
  }]
}]

@NgModule({
  exports: [RouterModule],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class MainRouterModule { }
