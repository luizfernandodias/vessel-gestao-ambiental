import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { TipoCondicionanteService } from 'src/app/service/tipo-condicionante.service';

@Component({
  selector: 'app-cadastrar-condicionante',
  templateUrl: './cadastrar-condicionante.component.html',
  styleUrls: ['./cadastrar-condicionante.component.css']
})
export class CadastrarCondicionanteComponent implements OnInit {

  private tipoCondicionanteForm = this.formBuilder.group({
    'descricao': [Validators.required]
  });

  constructor(private formBuilder: FormBuilder,
              private tipoCondicionanteService: TipoCondicionanteService) { 
  
  }

  ngOnInit() {

  }

  salvar(){
    console.log('teste');
    let descricao = this.tipoCondicionanteForm.get('descricao').value;
    //this.tipoCondicionanteService.salvar();
  }

}
