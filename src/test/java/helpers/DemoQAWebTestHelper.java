package helpers;

import net.serenitybdd.annotations.Step;
import pages.ElementsPage;

public class DemoQAWebTestHelper {

    ElementsPage elementsPage;

    @Step
    public void openDemoQAWebSiteURL() {
        elementsPage.open();
        elementsPage.getDriver().manage().window().maximize();
    }

    @Step
    public void textBoxSelection() {
        elementsPage.selectTextBox();
    }

    @Step
    public void fillFullNameTextBox() {
        elementsPage.enterFullName("Divya Yelampalli");
    }

    @Step
    public void fillEmailTextBox() {
        elementsPage.enterEmail("yelampallidivya@gmail.com");
    }

    @Step
    public void enterLine1AddressAndPressEnter() {
        elementsPage.enterTextAndPressEnterInCurrentAddress("Line1");
    }

    @Step
    public void enterLine2Address() {
        elementsPage.enterTextInCurrentAddress("Line2");
    }

    @Step
    public String getFullName() {
        return elementsPage.getFullNameText();
    }

    @Step
    public String getEmail() {
        return elementsPage.getEmailText();
    }

    @Step
    public String getCurrentAddress() {
        return elementsPage.getCurrentAddressText();
    }
}
