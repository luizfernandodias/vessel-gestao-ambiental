import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SobreOSigaComponent } from './sobre-o-siga.component';

describe('SobreOSigaComponent', () => {
  let component: SobreOSigaComponent;
  let fixture: ComponentFixture<SobreOSigaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SobreOSigaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SobreOSigaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
