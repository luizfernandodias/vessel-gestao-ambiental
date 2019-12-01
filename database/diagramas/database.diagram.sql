//Diagrama de entidade-relacionamento
Table TipoLicenca as TipoLicenca{
  id int [pk, increment]
  nome varchar(100)
}

Table Licenca {
  id int [pk, increment]
  tipoLicenca int [ref: > TipoLicenca.id]
  dataValidade date
  dataCriacao date
}

Table Pessoa {
  id int [pk, increment]
   
}

Table PessoaFisica {
  id int [pk, increment]
  pessoa int [ref: > Pessoa.id]
  
}

Table PessoaJuridica {
  id int [pk, increment]
  pessoa int [ref: > Pessoa.id]
  cnpj varchar(15)
  
}
