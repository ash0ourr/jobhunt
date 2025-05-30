import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompDashboardComponent } from './comp-dashboard.component';

describe('CompDashboardComponent', () => {
  let component: CompDashboardComponent;
  let fixture: ComponentFixture<CompDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CompDashboardComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CompDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
