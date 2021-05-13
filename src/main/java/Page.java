import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    static final int TIMEOUT = 5;
    static final String BASE_URL = "https://www.wikipedia.org/";

    WebDriver driver;
    WebDriverWait wait;


    Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, TIMEOUT);
    }

    void navigateToUrl(String urlPart) {
        driver.get(BASE_URL + urlPart);
    }
}