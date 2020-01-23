import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GardeningListComponent } from './gardening-list.component';

describe('GardeningListComponent', () => {
  let component: GardeningListComponent;
  let fixture: ComponentFixture<GardeningListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GardeningListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GardeningListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
