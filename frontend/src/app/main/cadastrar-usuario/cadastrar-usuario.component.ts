import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-cadastrar-usuario',
  templateUrl: './cadastrar-usuario.component.html',
  styleUrls: ['./cadastrar-usuario.component.css']
})
export class CadastrarUsuarioComponent implements OnInit {

  private tipoCondicionanteForm = this.formBuilder.group({
    'descricao': [Validators.required]
  });

  constructor(private formBuilder: FormBuilder) { 
  
  }

  ngOnInit() {

  }

  salvar(){

  }

}
