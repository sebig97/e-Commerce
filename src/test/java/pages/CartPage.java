package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;

import java.util.List;

public class CartPage extends BaseClass {

    @FindBy(className = "alert-warning")
    public List<WebElement> emptyCartWarning;

    @FindBy(id = "cart_summary")
    public List<WebElement> cartProducts;

    @FindBy(css = "p.cart_navigation > a.standard-checkout")
    public WebElement proceedCheckoutSummaryButton;

    @FindBy(css = "button[name*='process']")
    public WebElement proceedCheckoutButton;

    @FindBy(css = "div#uniform-cgv")
    public WebElement termsAndServiceCheckbox;

    @FindBy(className = "bankwire")
    public WebElement bankMethod;

    @FindBy(css = "button.button.btn.btn-default.button-medium > span:nth-child(1)")
    public WebElement confirmOrderButton;

    @FindBy(css = "td.cart_delete.text-center > div:nth-child(1)")
    public WebElement deleteIcon;

    public CartPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
