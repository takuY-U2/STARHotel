package introwork;

import org.junit.Test;
import core.ChromeDriverTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

/**
 * 入門課題その5:「チェックボックスを選択してみよう」
 * 解答例
 */
public class IntroWork5Test extends ChromeDriverTest {
    @Test
    public void testClickCheckbox() throws Exception {
        File html = new File("introwork/introWork5.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        WebElement allowedCheck = driver.findElement(By.id("allowed_check"));
        if (!allowedCheck.isSelected()) {
            allowedCheck.click();
        }
    }
}
