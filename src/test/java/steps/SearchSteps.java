package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchPage;
import utils.CommonMethods;

public class SearchSteps extends CommonMethods {

//    @Given("user is on {pageName} page")
//    public void userIsOnLoginPage(String pageName) {
////        String expectedTitle = "My Store";
////        String actualTitle = driver.getTitle();
////        Assert.assertEquals("User is not on the page!", actualTitle, expectedTitle);
//        userIsOnLoginPage(pageName);
//    }

    @When("user searches {string}")
    public void userSearches(String arg0) {
        sendText(searchPage.searchField, arg0);
    }

    @And("user clicks on search icon")
    public void userClicksOnSearchIcon() {
        click(searchPage.searchButton);
    }

    @Then("user is navigated to {string} page")
    public void userIsNavigatedToSearchPage(String arg0) {
        userIsOnPage(arg0);
    }

    @And("searched products exist")
    public void searchedProductsExist() {
        System.out.println("no products searched = " + numberOfElements(searchPage.searchedProductsList));
        Assert.assertNotEquals("Searched products size is 0!", 0, numberOfElements(searchPage.searchedProductsList));
    }

    @Given("user is on {string} page")
    public void userIsOnXPage(String arg0) {
        userIsOnPage(arg0);
    }

    @When("user adds product item to cart")
    public void userAddsProductItemToCart() {
        moveToElement(searchPage.searchedProductsList.get(0));
        click(searchPage.addToCartButton);
    }

    @Then("Message {string} appears on screen")
    public void messageAppearsOnScreen(String arg0) {
        System.out.println(getElementText(searchPage.successMessage));
        Assert.assertTrue("Adding was not successfull, message = " + getElementText(searchPage.successMessage), getElementText(searchPage.successMessage).contains(arg0));
    }

    @And("user continues shopping")
    public void userContinuesShopping() {
        click(searchPage.continueShoppingButton);
        wait(2);
    }

    @And("user procedees to checkout")
    public void userProcedeesToCheckout() {
        click(searchPage.checkoutButton);
        wait(2);
    }

}
