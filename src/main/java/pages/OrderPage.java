package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderPage extends Page {

    WebDriver driver;
    @FindBy(css = "#id")
    private WebElement searchBox;

    public OrderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void addToCart(){
        System.out.println("Adding 1 item to cart");
        System.out.println("Adding 2 item to cart");
        System.out.println("Adding 3 item to cart");
    }
}
