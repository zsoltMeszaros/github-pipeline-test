import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    protected static WebDriver driver;

    @BeforeAll
    protected static void setUp() throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "src/webdriver-exec/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterAll
    protected static void tearDown() {
        if (driver != null) {driver.quit();}
    }
}
