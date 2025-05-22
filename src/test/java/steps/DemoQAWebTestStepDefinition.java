package steps;

import helpers.DemoQAWebTestHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Shared;
import org.assertj.core.api.SoftAssertions;

public class DemoQAWebTestStepDefinition {

    @Shared
    DemoQAWebTestHelper demoQAWebTestHelper;
    @Given("I open the DemoQA website")
    public void openDemoQAWebsite() {
        demoQAWebTestHelper.openDemoQAWebSiteURL();
    }

    @When("I select Text Box from Elements")
    public void selectTextBoxFromElements() {
        demoQAWebTestHelper.textBoxSelection();
    }

    @When("I enter a valid name in the Full Name Text Box")
    public void enterValidNameInFullNameTextBox() {
        demoQAWebTestHelper.fillFullNameTextBox();
    }

    @When("I enter a valid email address in the Email Text Box")
    public void enterValidEmailAddressInEmailTextBox() {
        demoQAWebTestHelper.fillEmailTextBox();
    }

    @When("I enter the address line 1 and press enter in the Current Address Text Box")
    public void enterAddressLine1AndPressEnterInCurrentAddressTextBox() {
        demoQAWebTestHelper.enterLine1AddressAndPressEnter();
    }

    @When("I enter address line 2 in the Current Address Text Box")
    public void enterAddressLine2InCurrentAddressTextBox() {
        demoQAWebTestHelper.enterLine2Address();
    }

    @Then("The text boxes should be populated with the correct values")
    public void textBoxesShouldBePopulatedWithTheCorrectValues() {
        String fullNameText = demoQAWebTestHelper.getFullName();
        String emailText = demoQAWebTestHelper.getEmail();
        String currentAddress = demoQAWebTestHelper.getCurrentAddress();
        String[] lines = currentAddress.split("\n");

        SoftAssertions softAssert = new SoftAssertions();

        softAssert.assertThat(fullNameText).contains("Divya");
        softAssert.assertThat(emailText).contains("@");
        softAssert.assertThat(lines.length).isEqualTo(2);

        softAssert.assertAll();
    }
}
