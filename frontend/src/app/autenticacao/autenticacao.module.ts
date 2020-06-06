import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AutenticacaoRouterModule } from './autenticacao-router.module';
import { RecuperacaoSenhaComponent } from './recuperacao-senha/recuperacao-senha.component';
import { MatFormFieldModule } from '@angular/material';


@NgModule({
  declarations: [LoginComponent, RecuperacaoSenhaComponent],
  imports: [
    CommonModule,
    MatCardModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatSnackBarModule,
    FormsModule,
    ReactiveFormsModule,
    AutenticacaoRouterModule,
    MatFormFieldModule
  ],
  providers: [
    AutenticacaoRouterModule
  ],
  exports: [
    LoginComponent,
    RecuperacaoSenhaComponent
  ]
})
export class AutenticacaoModule { }
