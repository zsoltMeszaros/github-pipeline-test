import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends Page{


    public IndexPage(WebDriver driver) {
        super(driver);
    }

    private final By pageTitle = By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span");

    private void navigateToIndexPage(){
        navigateToUrl("");
    }

    public String getPageTitle(){
        navigateToIndexPage();
        return driver.findElement(pageTitle).getText();
    }
}
