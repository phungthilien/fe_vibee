import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SidebarEmployeeComponent } from './sidebar.component';

describe('SidebarEmployeeComponent', () => {
  let component: SidebarEmployeeComponent;
  let fixture: ComponentFixture<SidebarEmployeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SidebarEmployeeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SidebarEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});