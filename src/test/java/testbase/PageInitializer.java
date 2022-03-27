package testbase;

import pages.CartPage;
import pages.LoginPage;
import pages.MainPage;
import pages.SearchPage;

public class PageInitializer extends BaseClass {

    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static SearchPage searchPage;
    public static CartPage cartPage;

    public static void initialize() {
        loginPage = new LoginPage();
        mainPage = new MainPage();
        searchPage = new SearchPage();
        cartPage = new CartPage();
    }
}
