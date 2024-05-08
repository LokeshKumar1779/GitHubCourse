public class OrderPage extends Page{

     WebDriver driver;
    @FindBy(css = "#id")
     private WebElement searchBox;

    public OrderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
