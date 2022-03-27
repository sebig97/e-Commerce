package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;

import java.util.List;

public class SearchPage extends BaseClass {

    @FindBy(id = "search_query_top")
    public WebElement searchField;

    @FindBy(className = "button-search")
    public WebElement searchButton;

    @FindBy(className = "ajax_add_to_cart_button")
    public WebElement addToCartButton;

    @FindBy(css = "div.layer_cart_product > h2")
    public WebElement successMessage;

    @FindBy(css = "div.layer_cart_cart > div.button-container > span.continue")
    public WebElement continueShoppingButton;

    @FindBy(css = "div.layer_cart_cart > div.button-container > a.btn")
    public WebElement checkoutButton;

    @FindBy(css = "ul.product_list li.ajax_block_product")
    public List<WebElement> searchedProductsList;

    public SearchPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
