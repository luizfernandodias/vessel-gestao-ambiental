import { Component, OnInit } from '@angular/core';
import * as ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-cadastrar-licenca',
  templateUrl: './cadastrar-licenca.component.html',
  styleUrls: ['./cadastrar-licenca.component.css']
})
export class CadastrarLicencaComponent implements OnInit {

  
  private editor = ClassicEditor;

  private licencaForm = this.formBuilder.group({
    'nomeEmpredimento': [Validators.required]
  });

  private config = {
    language: 'pt-br'    
  }
  
  constructor(
    private formBuilder: FormBuilder
  ) { }

  ngOnInit() {
    
  }

  salvar() {

  }

}
