package stepDefs;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.ProductPage;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;


public class StepDefs extends BaseClass {
    private HomePage homePage;
    private ProductPage productPage;
    @Given("I am on the home page and I search the product {string} on the search bar")
    public void i_am_on_the_home_page_and_i_search_the_product_on_the_search_bar(String string) {
        homePage = new HomePage();
        homePage.searchBar.sendKeys(string);
    }
    @When("I click the search icon i see a list of products")
    public void i_click_the_search_icon_i_see_a_list_of_products() {
        homePage.searchBtn.click();
    }

    @Then("I select the product {string}")
    public void iSelectTheProduct(String arg0) {

        homePage.productSelect.click();
        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        //assert on title of new window
        String title=driver.getTitle();
        assertEquals(arg0,title);
    }

    @Then("I am on the product page and I the click add to cart button")
    public void iAmOnTheProductPageAndITheClickAddToCartButton() {

        productPage = new ProductPage();
        productPage.notNowBtn.click();
        productPage.addToCartBtn.click();
    }

    @Then("I verify that {string} added in the cart")
    public void iVerifyThatAddedInTheCart(String expected) {
        productPage.verifyProduct.isDisplayed();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(productPage.verifyProduct));
        String actualProduction = element.getText();
        System.out.println("==== actualProduction ==== " + actualProduction);
        assertEquals( actualProduction,expected);
    }


}
