package introwork;

import core.ChromeDriverTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

/**
 * 入門課題その2:「クリックしてみよう」
 */
public class IntroWork8Test extends ChromeDriverTest {
    @Test
    public void testClickOKButton() throws Exception {
        File html = new File("introwork/introWork8.html");
        String url = html.toURI().toString();
        driver.get(url);

        Actions actions = new Actions(driver);
        WebElement lastButton = driver.findElement(By.id("last_button"));
        actions.moveToElement(lastButton);
        actions.perform();
    }
}
