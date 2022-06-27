package pages.bluerentalcarpage;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class bluerentalcar_home_page {
    public bluerentalcar_home_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
