import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkTest extends BaseTest {

    @Test
    public void testLinkIsWorking() {
        WebElement link = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));

        String url = link.getAttribute("href");

        assert url != null;
        driver.navigate().to(url);
        System.out.println(url);

        String expectedTitle = "Порядок оплаты и безопасность интернет платежей";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        assertEquals(expectedTitle, actualTitle, "The page title does not match the expected title.");
    }
}
