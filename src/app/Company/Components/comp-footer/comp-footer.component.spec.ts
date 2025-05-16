import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompFooterComponent } from './comp-footer.component';

describe('CompFooterComponent', () => {
  let component: CompFooterComponent;
  let fixture: ComponentFixture<CompFooterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CompFooterComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CompFooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
