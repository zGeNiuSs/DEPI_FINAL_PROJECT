package pages;

import driverFactory.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage {

    private Driver driver;


    By logoutLink = By.xpath("//a[@href=\"/logout\"]");
    By loginLink = By.xpath("//a[@href=\"/login\"]");
    By deleteAccountLink = By.xpath("//a[@href=\"/delete_account\"]");
    By contactUsLink = By.xpath("//a[@href=\"/contact_us\"]");
    By testCaseLink = By.xpath("(//a[@href=\"/test_cases\"])[1]");
    By productsLink = By.xpath("//a[@href=\"/products\"]");
    By hoverOnFirstProductLink = By.xpath("(//div[@class=\"overlay-content\"])[1]");
    By clickOnFirstProductAddToCartButton = By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]");
    By viewCart = By.xpath("(//a[@href=\"/view_cart\"])[2]");
    By subscriptionTitle = By.xpath("//div[@class=\"single-widget\"]/h2");
    By emailField = By.id("susbscribe_email");
    By submitEmailButton = By.id("subscribe");
    By SuccessMessage = By.id("success-subscribe");
    By footer = By.id("footer");
    By viewProduct = By.xpath("//a[@href=\"/product_details/1\"]");
    By loggedInAsUser = By.xpath("//b");
    By cartLink = By.xpath("(//a[@href=\"/view_cart\"])[1]");
    By signupLoginBtn = By.xpath("//a[@href=\"/login\"]");
    By leftSideBar = By.xpath("(//h2)[4]");
    By womenCategory = By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a");
    By topsWomenCategory = By.xpath("//*[@id=\"Women\"]/div/ul/li[2]/a");



    public HomePage(Driver driver) {
        this.driver = driver;
    }

    /*********************************  Assertions  *****************************************************/

    public HomePage checkThatLogOutLinkShouldBeDisplayed() {
        Assert.assertTrue(driver.element().isDisplayed(logoutLink));
        return this;
    }

    public HomePage checkThatDeleteLinkShouldBeDisplayed() {
        Assert.assertTrue(driver.element().isDisplayed(deleteAccountLink));
        return this;
    }

    public HomePage checkThatLoginLinkShouldBeDisplayed() {
        Assert.assertTrue(driver.element().isDisplayed(loginLink));
        return this;
    }

    public HomePage checkThatHomePageIsLoadedSuccessfully() {
        Assert.assertEquals(driver.browser().getCurrentURL(), "https://automationexercise.com/");
        return this;
    }

    public HomePage checkThatSubscriptionIsvIsVisible() {
        driver.element().scrollToElement(footer);
        Assert.assertTrue(driver.element().isDisplayed(subscriptionTitle));
        return this;
    }

    public HomePage checkThatSuccessMessageDisplayedSuccessfully() {
        Assert.assertEquals(driver.element().getTextOf(SuccessMessage), "You have been successfully subscribed!");
        return this;
    }
    public HomePage checkThatLoggedInAsUsernameIsDisplayed() {
        Assert.assertTrue(driver.element().isDisplayed(loggedInAsUser));
        return this;
    }

    public HomePage checkThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(driver.element().getTextOf(leftSideBar), "CATEGORY");
        return this;
    }


    /*********************************  Actions  *****************************************************/

    public LoginSignupPage clickOnLoginLink() {
        driver.element().click(loginLink);
        return new LoginSignupPage(driver);
    }

    public LoginSignupPage clickOnLogOutLink() {
        driver.element().click(logoutLink);
        return new LoginSignupPage(driver);
    }

    public AccountSuccessfulDeletion clickOnDeleteAccountLink() {
        driver.element().click(deleteAccountLink);
        return new AccountSuccessfulDeletion(driver);
    }

    public ContactUsPage clickOnContactUsLink() {
        driver.element().click(contactUsLink);
        return new ContactUsPage(driver);
    }

    public TestCasePage clickOnTestCaseLink() {
        driver.element().click(testCaseLink);
        return new TestCasePage(driver);
    }

    public ProductsPage clickOnProductsLink() {
        driver.element().click(productsLink);
        return new ProductsPage(driver);
    }

    public HomePage hoverOnFirstItem() {
        driver.element().hoverOnItem(hoverOnFirstProductLink);
        return this;
    }

    public HomePage clickOnFirstAddToCartButton() {
        driver.element().click(clickOnFirstProductAddToCartButton);
        return this;
    }

    public ViewCartPage clickOnViewCartButton() {
        driver.element().click(viewCart);
        return new ViewCartPage(driver);
    }

    public HomePage fillEmailField(String email) {
        driver.element().fillField(emailField, email);
        return this;
    }

    public HomePage clickOnEmailSubscriptionButton() {
        driver.element().click(submitEmailButton);
        return this;
    }
    public FirstProductPage clickOnViewProductButton() {
        driver.element().click(viewProduct);
        return new FirstProductPage(driver);
    }


    public ViewCartPage clickOnCartLink() {
        driver.element().click(cartLink);
        return new ViewCartPage(driver);
    }
    public LoginSignupPage clickOnLoginSignupBtn() {
        driver.element().click(signupLoginBtn);
        return new LoginSignupPage(driver);
    }

    public HomePage clickOnWomenCategory() {
        driver.element().click(womenCategory);
        return this;
    }

    public WomenProductPage clickOnTopsWomenCategory() {
        driver.element().click(topsWomenCategory);
        return new WomenProductPage(driver);
    }

}
