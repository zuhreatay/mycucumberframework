package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;
    @FindBy(id = "email")
    public WebElement faceUsername;
    @FindBy(id = "pass")
    public WebElement facePasword;
    @FindBy(id = "u_0_b")
    public WebElement faceLoginButton;
}
