import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, Validators } from '@angular/forms';
import { LoginService } from 'src/app/service/login.service';

@Component({
  selector: 'app-recuperacao-senha',
  templateUrl: './recuperacao-senha.component.html',
  styleUrls: ['./recuperacao-senha.component.css']
})
export class RecuperacaoSenhaComponent implements OnInit {

  private recuperacaoSenhaForm =  this.formBuilder.group({
    email: new FormControl('email', [Validators.required])
   })

  constructor(private formBuilder: FormBuilder,
              private loginService: LoginService) { }

  ngOnInit() {
  }

  recuperacaoSenha()
  {
    let email = this.recuperacaoSenhaForm.get('email').value;
    this.loginService.recuperacaoSenha(email);
  }

}
