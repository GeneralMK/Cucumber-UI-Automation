package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {
    public ProductPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//button[@class='ab-message-button'])[1]")
    public WebElement notNowBtn;
    @FindBy(xpath = "//div[@class='action-cart buybox-actions-module_button-cell_2dQyM buybox-actions-module_add-to-cart-cell_3fXyS']//a")
    public WebElement addToCartBtn;


    @FindBy(xpath = "//div[contains(text(),'Samsung 303L Bottom Freezer With Water Dispenser And Cool Pack')]")
    public WebElement verifyProduct;
}
