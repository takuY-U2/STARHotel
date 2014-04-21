package introwork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

/**
 * 入門課題その3:「文字列を入力してみよう」
 * 解答例
 */
public class IntroWork3 extends ChromeDriverTest {
    @Test
    public void testClearAndSendKeys() throws Exception {
        File html = new File("introwork/introWork3.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        WebElement subject = driver.findElement(By.id("subject"));
        subject.clear();
        subject.sendKeys("Selenium");
    }
}
