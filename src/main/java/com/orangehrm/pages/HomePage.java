package com.orangehrm.pages;

import com.orangehrm.pages.pagecomponents.LeftMenuComponent;

import static com.orangehrm.pages.enums.LeftMenuComponentType.PIM;

public class HomePage {

  private final LeftMenuComponent leftMenuComponent;

  public HomePage() {
    this.leftMenuComponent = new LeftMenuComponent();
  }

  public LeftMenuComponent getLeftMenuComponent() {
    return leftMenuComponent;
  }

  public EmployeeInformationPage navigateToEmployeeInformationPage() {
    this.leftMenuComponent.selectAMenuFromLeftMenuBar(PIM);
    return new EmployeeInformationPage();
  }

}