import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';


@NgModule({
  declarations: [LoginComponent],
  imports: [
    CommonModule,
    MatCardModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatButtonModule
  ],
  exports: [
    LoginComponent
  ],
  providers: []
})
export class AutenticacaoModule { }
