import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleVerificationTest extends BaseTest {

    @Test
    public void testTitleText() {
      
        WebElement titleElement = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));

        String titleText = titleElement.getText();
        System.out.println(titleText);

        assertEquals("Онлайн пополнение\nбез комиссии", titleText, "Название блока не соответствует ожидаемому!");
    }
}

