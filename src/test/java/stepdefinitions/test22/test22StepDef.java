package stepdefinitions.test22;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.test22.test22Page;
import utilities.Driver;

public class test22StepDef {

    test22Page test22Page=new test22Page();

    @When("scroll the bottom page")
    public void scroll_the_bottom_page() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @Then("verify RECOMMENDS ITEMS are visible")
    public void verify_recommends_items_are_visible() {
        Assert.assertTrue(test22Page.recommendItems.isDisplayed());
    }
    @Then("click on Add to Cart on recommended product")
    public void click_on_add_to_cart_on_recommended_product() {
       test22Page.addToCart.click();
    }
    @Then("click on View Card button")
    public void click_on_view_card_button() {
        test22Page.viewCart.click();
    }
    @Then("verify that products is displayed in cart page")
    public void verify_that_products_is_displayed_in_cart_page() {
    Assert.assertTrue(test22Page.shoppingCartText.isDisplayed());
    Assert.assertTrue(test22Page.blueTop.isDisplayed());

    }
}
