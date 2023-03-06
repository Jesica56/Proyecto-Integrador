import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoProComponent } from './logo-pro.component';

describe('LogoProComponent', () => {
  let component: LogoProComponent;
  let fixture: ComponentFixture<LogoProComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoProComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoProComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
