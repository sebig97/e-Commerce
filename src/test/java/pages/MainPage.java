package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;

public class MainPage {

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement signout;

    @FindBy(css = "a[title='View my shopping cart']")
    public WebElement cartButton;

    public MainPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
