package pages;

import org.openqa.selenium.WebDriver;

public class CherryPage extends Page{
    public CherryPage(WebDriver driver) {
        super(driver);
    }

    public void cherryMethod(){
        System.out.println("line1");
        System.out.println("line2");
    }
}
