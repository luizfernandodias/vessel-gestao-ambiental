import { Component, OnInit } from '@angular/core';
import * as ClassicEditor from '@ckeditor/ckeditor5-build-classic';

@Component({
  selector: 'app-cadastrar-licenca',
  templateUrl: './cadastrar-licenca.component.html',
  styleUrls: ['./cadastrar-licenca.component.css']
})
export class CadastrarLicencaComponent implements OnInit {

  
  public editor = ClassicEditor;

  constructor() { }

  ngOnInit() {
  }

  cadastrarLicenca() {

  }

}
