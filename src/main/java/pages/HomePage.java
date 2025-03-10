package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@id='72546513']")
    public WebElement productSelect;

}
