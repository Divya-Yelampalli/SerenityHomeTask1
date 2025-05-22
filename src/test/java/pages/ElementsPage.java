package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Optional;

public class ElementsPage extends PageObject {

    @FindBy(xpath = "//span[@class='text']")
    List<WebElementFacade> elements;

    @FindBy(id = "currentAddress")
    WebElementFacade currentAddress;
    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public void selectTextBox() {
        Optional<WebElementFacade> textBox = elements.stream()
                .filter(element -> element.getText().equals("Text Box"))
                .findFirst();
        textBox.ifPresent(WebElementFacade::click);
    }

    public void enterFullName(String fullName) {
        find(By.id("userName")).sendKeys(fullName);
    }

    public void enterEmail(String email) {
       WebElementFacade emailTextBox = $(By.xpath("//*[@id='userEmail']"));
       emailTextBox.sendKeys(email);
    }

    public void enterTextAndPressEnterInCurrentAddress(String addressLine1) {
        currentAddress.typeAndEnter(addressLine1);
    }

    public void enterTextInCurrentAddress(String addressLine2) {
        currentAddress.sendKeys(addressLine2);
    }

    public String getFullNameText() {
        return find(By.id("userName")).getValue();
    }

    public String getEmailText() {
        return $(By.xpath("//*[@id='userEmail']")).getValue();
    }

    public String getCurrentAddressText() {
        return currentAddress.getValue();
    }
}
