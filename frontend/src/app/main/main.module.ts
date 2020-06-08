import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateUsuarioComponent } from './create-usuario/create-usuario.component';
import { MainRouterModule } from './main-router.module';
import { RouterModule } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { MatSidenavModule,
         MatToolbarModule,
         MatIconModule, 
         MatCheckboxModule,
         MatMenuModule,
         MatCardModule,
         MatSelectModule,
         MatInputModule,
         MatFormFieldModule,
         MatDatepickerModule,
         MatNativeDateModule,
         MatButtonModule
        } from '@angular/material';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CadastrarLicencaComponent } from './cadastrar-licenca/cadastrar-licenca.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CKEditorModule } from '@ckeditor/ckeditor5-angular';

@NgModule({
  declarations: [
    CreateUsuarioComponent,
    MenuComponent,
    CadastrarLicencaComponent
  ],
  imports: [
    CommonModule,
    MainRouterModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    MatSidenavModule,
    MatToolbarModule,
    MatIconModule,
    MatCheckboxModule,
    MatCardModule,
    MatSelectModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,
    MatMenuModule,
    MatDatepickerModule,
    MatNativeDateModule,
    BrowserAnimationsModule,
    MatMenuModule,
    MatButtonModule,
    CKEditorModule
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

