import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestIndexPage extends BaseTest{

    private IndexPage indexPage = new IndexPage(driver);

    @Test
    void testIndexPageTitle(){
        final String expectedTitle = "Wikipedia";

        final String pageTitle = indexPage.getPageTitle();

        Assertions.assertEquals(expectedTitle, pageTitle);
    }
}
