import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarLicencaComponent } from './cadastrar-licenca.component';

describe('CadastrarLicencaComponent', () => {
  let component: CadastrarLicencaComponent;
  let fixture: ComponentFixture<CadastrarLicencaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarLicencaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarLicencaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
