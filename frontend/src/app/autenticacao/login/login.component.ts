import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/service/login.service';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { StorageService } from 'src/app/service/storage.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private loginForm =  this.formBuilder.group({
    username: new FormControl('username', [Validators.required]),
    password: new FormControl('password', [Validators.required])
  })

  constructor(
    private loginService: LoginService,
    private formBuilder: FormBuilder,
    private snackBar: MatSnackBar,
    private storage: StorageService
  ) { }

  ngOnInit() {

  }

  login(){
    console.log(this.loginForm);
    return this.loginService.login(
      this.loginForm.get('username').value,
      this.loginForm.get('password').value
    ).toPromise().then((result) => {
      console.log(result);
      this.storage.storeOnLocalStorage('access_token', result['access_token']);
      this.storage.storeOnLocalStorage('token_type', result['token_type']);
      this.storage.storeOnLocalStorage('refresh_token', result['refresh_token']);

    }).catch((error) => {
        this.snackBar.open('Usuario ou senha incorretos', 'error', {
          duration: 4000,
        });
    });
  }

}
