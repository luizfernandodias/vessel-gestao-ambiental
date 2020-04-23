import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateUsuarioComponent } from './create-usuario/create-usuario.component';
import { MainRouterModule } from './main-router.module';
import { RouterModule } from '@angular/router';




@NgModule({
  declarations: [ 
    CreateUsuarioComponent
  ],
  imports: [
    CommonModule,
    MainRouterModule,
    RouterModule
  ],
  providers: [
    MainRouterModule
  ],
  exports: [
    CreateUsuarioComponent
  ]
})
export class MainModule { }

