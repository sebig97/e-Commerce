package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class CartSteps extends CommonMethods {

    @When("user goes to cart")
    public void userGoesToCart() {
        moveToElement(mainPage.cartButton);
        click(mainPage.cartButton);
    }

    @And("user check if cart has products")
    public void userCheckIfCartHasProducts() {
        Assert.assertTrue("cart is empty", cartPage.cartProducts.size() != 0);
    }

    @And("user clicks next to proceed to checkout - Summary")
    public void userClicksNextToProceedToCheckout() {
        movetoElementAndClick(cartPage.proceedCheckoutSummaryButton);
    }

    @When("user agrees the terms and conditions")
    public void userAgreesTheTermsAndConditions() {
        click(cartPage.termsAndServiceCheckbox);
    }

    @And("user selects bank wire payment method")
    public void userSelectsBankWirePaymentMethod() {
        movetoElementAndClick(cartPage.bankMethod);
    }

    @And("user confirms order")
    public void userConfirmsOrder() {
        System.out.println(getElementText(cartPage.confirmOrderButton));
        movetoElementAndClick(cartPage.confirmOrderButton);
        wait(2);
    }

    @And("user clicks next to proceed to checkout")
    public void userClicksNextToProceedToCheckoutAddress() {
        movetoElementAndClick(cartPage.proceedCheckoutButton);
    }

    @When("user deletes first product")
    public void userDeletesFirstProduct() {
        click(cartPage.deleteIcon);
    }

    @Then("Empty warning message should appear")
    public void emptyWarningMessageShouldAppear() {
        Assert.assertTrue(cartPage.emptyCartWarning.get(0).getText(), cartPage.emptyCartWarning.size() != 0);
    }
}
