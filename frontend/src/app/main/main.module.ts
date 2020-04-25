import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateUsuarioComponent } from './create-usuario/create-usuario.component';
import { MainRouterModule } from './main-router.module';
import { RouterModule } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { MatSidenavModule, MatToolbarModule, MatIconModule, MatCheckboxModule, MatMenuModule} from '@angular/material';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    CreateUsuarioComponent,
    MenuComponent
  ],
  imports: [
    CommonModule,
    MainRouterModule,
    RouterModule,
    MatSidenavModule,
    MatToolbarModule,
    MatIconModule,
    MatCheckboxModule,
    FormsModule,
    MatMenuModule
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

