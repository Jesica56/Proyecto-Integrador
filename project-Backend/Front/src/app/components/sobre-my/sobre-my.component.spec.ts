import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SobreMyComponent } from './sobre-my.component';

describe('SobreMyComponent', () => {
  let component: SobreMyComponent;
  let fixture: ComponentFixture<SobreMyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SobreMyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SobreMyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
