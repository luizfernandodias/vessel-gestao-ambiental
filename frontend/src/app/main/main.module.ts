import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateUsuarioComponent } from './create-usuario/create-usuario.component';
import { MainRouterModule } from './main-router.module';
import { RouterModule } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { MatSidenavModule } from '@angular/material';




@NgModule({
  declarations: [
    CreateUsuarioComponent,
    MenuComponent
  ],
  imports: [
    CommonModule,
    MainRouterModule,
    RouterModule,
    MatSidenavModule
  ],
  providers: [
    MainRouterModule
  ],
  exports: [
    CreateUsuarioComponent,
    MenuComponent
  ]
})
export class MainModule { }

