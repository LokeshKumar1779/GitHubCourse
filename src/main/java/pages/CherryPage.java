package pages;

import org.openqa.selenium.WebDriver;

public class CherryPage extends Page{
    public CherryPage(WebDriver driver) {
        super(driver);
    }

    public void cherryMethod(){
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");
        System.out.println("line5");
    }
}
