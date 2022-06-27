package pages.test22;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class test22Page {

    public test22Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//*[.='recommended items']")
    public WebElement recommendItems;

    @FindBy(xpath = "(//a[.='Add to cart'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//li[.='Shopping Cart']")
    public WebElement shoppingCartText;

    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement blueTop;


}
