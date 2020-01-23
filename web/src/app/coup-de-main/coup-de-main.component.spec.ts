import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CoupDeMainComponent } from './coup-de-main.component';

describe('CoupDeMainComponent', () => {
  let component: CoupDeMainComponent;
  let fixture: ComponentFixture<CoupDeMainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CoupDeMainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CoupDeMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
