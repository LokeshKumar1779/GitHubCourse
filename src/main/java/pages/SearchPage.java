package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Page{

     WebDriver driver;
    @FindBy(css = "#id")
     private WebElement searchBox;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void SearchProduct(String item){
        waitForElementVisibility(searchBox,5);
        searchBox.sendKeys(item);
    }


}
