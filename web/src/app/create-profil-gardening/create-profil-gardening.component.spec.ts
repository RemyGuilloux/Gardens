import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateProfilGardeningComponent } from './create-profil-gardening.component';

describe('CreateProfilGardeningComponent', () => {
  let component: CreateProfilGardeningComponent;
  let fixture: ComponentFixture<CreateProfilGardeningComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateProfilGardeningComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateProfilGardeningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
