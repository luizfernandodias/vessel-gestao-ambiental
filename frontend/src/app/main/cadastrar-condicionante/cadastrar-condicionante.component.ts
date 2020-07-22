import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { TipoCondicionanteService } from 'src/app/service/tipo-condicionante.service';

@Component({
  selector: 'app-cadastrar-condicionante',
  templateUrl: './cadastrar-condicionante.component.html',
  styleUrls: ['./cadastrar-condicionante.component.css']
})
export class CadastrarCondicionanteComponent implements OnInit {

  constructor(private formBuilder: FormBuilder) { 
  
  }

  ngOnInit() {

  }

  salvar(){

  }

}
