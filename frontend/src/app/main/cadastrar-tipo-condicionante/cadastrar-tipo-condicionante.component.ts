import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormControl } from '@angular/forms';
import { TipoCondicionanteService } from 'src/app/service/tipo-condicionante.service';
import { TipoCondicionante } from 'src/app/model/tipoCondicionante';
import { SimpleSnackBar, MatSnackBar } from '@angular/material';

@Component({
  selector: 'app-cadastrar-tipo-condicionante',
  templateUrl: './cadastrar-tipo-condicionante.component.html',
  styleUrls: ['./cadastrar-tipo-condicionante.component.css']
})
export class CadastrarTipoCondicionanteComponent implements OnInit {
  
  private tipoCondicionanteForm = this.formBuilder.group({
    'descricao': new FormControl('', [Validators.required]),
    'observacao': new FormControl('', [Validators.required])
  });

  constructor(
    private formBuilder: FormBuilder,
    private tipoCondicionanteService: TipoCondicionanteService,
    private snackBar: MatSnackBar
    ) { 
  
  }

  ngOnInit() {

  }

  salvar(){
    let tipoCondicionante = new TipoCondicionante();
    tipoCondicionante.observacao = this.tipoCondicionanteForm.get('observacao').value;
    tipoCondicionante.descricao  = this.tipoCondicionanteForm.get('descricao').value;
    this.tipoCondicionanteService.salvar(tipoCondicionante).toPromise().then((result)=>{
      this.snackBar.open('Tipo de condicionante gravado com sucesso!', 'success', {
        duration: 4000,
      });
    }).catch((error)=>{
      this.snackBar.open('Erro ao se cadastrar o tipo de condicionante', 'error',{
        duration: 4000
      });
    });
  }

}
