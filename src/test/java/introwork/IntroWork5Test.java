package introwork;

import core.ChromeDriverTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import java.io.File;

/**
 * 入門課題その5:「チェックボックスを選択してみよう」
 */
public class IntroWork5Test extends ChromeDriverTest {
    @Test
    public void testClickCheckbox() throws Exception {
        File html = new File("introwork/introWork5.html");
        String url = html.toURI().toString();
        driver.get(url);

        WebElement allowedCheck = driver.findElement(By.id("allowed_check"));
        if(!allowedCheck.isSelected()) {
            allowedCheck.click();
        }
    }
}
