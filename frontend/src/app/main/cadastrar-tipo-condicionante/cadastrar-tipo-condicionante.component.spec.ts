import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarTipoCondicionanteComponent } from './cadastrar-tipo-condicionante.component';

describe('CadastrarTipoCondicionanteComponent', () => {
  let component: CadastrarTipoCondicionanteComponent;
  let fixture: ComponentFixture<CadastrarTipoCondicionanteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarTipoCondicionanteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarTipoCondicionanteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
