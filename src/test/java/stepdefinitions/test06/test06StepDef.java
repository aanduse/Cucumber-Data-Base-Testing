package stepdefinitions.test06;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.test06.test06Page;
import utilities.ConfigReader;
import utilities.Driver;

public class test06StepDef {

    test06Page test06Page=new test06Page();
    Faker faker=new Faker();
    @Given("launch the browser")
    public void launch_the_browser() {
       Driver.getDriver();
    }
    @When("user navigate the url")
    public void user_navigate_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
    }
    @Then("verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(test06Page.contactUsLink.isDisplayed());

    }
    @Then("click contact us button")
    public void click_contact_us_button() {
        test06Page.contactUsLink.click();
    }
    @Then("verify get in touch is visible")
    public void verify_get_in_touch_is_visible() {
    Assert.assertTrue(test06Page.getInTouchText.isDisplayed());

    }
    @Then("enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
    test06Page.nameTextBox.sendKeys(faker.name().name());
    test06Page.emailTextBox.sendKeys(faker.internet().emailAddress());
    test06Page.subjectTextBox.sendKeys("SELENIUM");
    test06Page.messageTextBox.sendKeys("SeleniumSeleniumSeleniumSeleniumSelenium");

    }
    @Then("upload file")
    public void upload_file() {
    String path="C:\\Users\\pc\\Downloads\\logo.jpeg";
    test06Page.uploadFile.sendKeys(path);
    }
    @Then("click submit button")
    public void click_submit_button() {
    test06Page.submitButton.click();
    }
    @Then("click OK button")
    public void click_ok_button() {
    Driver.getDriver().switchTo().alert().accept();
    }
    @And("verify success message Success!.Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(test06Page.successMessage.getText().equals
                ("Success! Your details have been submitted successfully."));
    }

    @Then("click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        test06Page.homeLink.click();
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Automation Exercise"));
    }
    @Then("close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }


}
