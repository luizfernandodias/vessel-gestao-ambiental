import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(
    private router: Router    
  ) { }


  ngOnInit() {

  }

  cadastrarLicenca() {
    this.router.navigate(['main','cadastrar-licenca']);
  }

  cadastrarUsuario() {
    this.router.navigate(['main','cadastrar-usuario']);
  }

  cadastrarCondicionante(){
    this.router.navigate(['main','cadastrar-condicionante']);
  }

  cadastrarTipoCondicionante(){
     this.router.navigate(['main','cadastrar-tipo-condicionante']);
  }

  sair(){
    this.router.navigate(['autenticacao','login']);
  }

  sobreOSiga(){
    this.router.navigate(['main','sobre-o-siga']);
  }

  listarCondicionantes(){

  }

}
