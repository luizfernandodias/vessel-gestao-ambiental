import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/service/login.service';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { StorageService } from 'src/app/service/storage.service';
import { Router } from '@angular/router';
import { OAuthService } from 'angular-oauth2-oidc';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private loginForm =  this.formBuilder.group({
    username: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required])
  })

  constructor(
    private oauthService: OAuthService,
    private loginService: LoginService,
    private formBuilder: FormBuilder,
    private snackBar: MatSnackBar,
    private storage: StorageService,
    private router: Router
  ) { }

  ngOnInit() {
    
  }

  login() {
    return this.loginService.login(
      this.loginForm.get('username').value,
      this.loginForm.get('password').value
    ).toPromise().then((result) => {
      this.storage.storeOnLocalStorage('access_token', result['access_token']);
      this.storage.storeOnLocalStorage('token_type', result['token_type']);
      this.storage.storeOnLocalStorage('refresh_token', result['refresh_token']);
      this.storage.storeOnLocalStorage('username', this.loginForm.get('username').value)
      this.storage.storeOnLocalStorage('password', this.loginForm.get('password').value)
      this.router.navigate(['main', 'cadastrar-usuario']);

    }).catch((error) => {
        this.snackBar.open('Usuario ou senha incorretos', 'error', {
          duration: 4000,
        });
    });
  }

  recuperarSenha() {
    this.router.navigate(['autenticacao' ,'recuperacao-senha']);
  }

}
