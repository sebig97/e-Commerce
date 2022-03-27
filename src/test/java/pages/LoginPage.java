package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.BaseClass;

public class LoginPage extends BaseClass {

    @FindBy(className = "login")
    public WebElement signinButton;

    @FindBy(id="email")
    public WebElement username;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(id="SubmitLogin")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

}
