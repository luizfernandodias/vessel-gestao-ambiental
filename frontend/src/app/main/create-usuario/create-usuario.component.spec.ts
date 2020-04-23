import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateUsuarioComponent } from './create-usuario.component';

describe('CreateUsuarioComponent', () => {
  let component: CreateUsuarioComponent;
  let fixture: ComponentFixture<CreateUsuarioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateUsuarioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateUsuarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
