package pages.test06;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class test06Page {

    public test06Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy(linkText = "Contact us")
  public WebElement contactUsLink;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectTextBox;

    @FindBy(id = "message")
    public WebElement messageTextBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

  @FindBy(xpath = "//input[@name='submit']")
  public WebElement submitButton;

  @FindBy(xpath = "//div[@class='status alert alert-success']")
  public WebElement successMessage;

  @FindBy(linkText = "Home")
  public WebElement homeLink;
}
