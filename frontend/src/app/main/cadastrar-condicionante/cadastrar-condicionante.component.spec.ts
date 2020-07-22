import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarCondicionanteComponent } from './cadastrar-condicionante.component';

describe('CadastrarCondicionanteComponent', () => {
  let component: CadastrarCondicionanteComponent;
  let fixture: ComponentFixture<CadastrarCondicionanteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarCondicionanteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarCondicionanteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
