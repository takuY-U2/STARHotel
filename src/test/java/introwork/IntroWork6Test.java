package introwork;

import core.ChromeDriverTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

/**
 * 入門課題その6:「プルダウンを選択してみよう」
 */
public class IntroWork6Test extends ChromeDriverTest {
    @Test
    public void testSelectOptionByValue() throws Exception {
        File html = new File("introwork/introWork6.html");
        String url = html.toURI().toString();
        driver.get(url);

        WebElement headCount = driver.findElement(By.id("head_count"));
        Select select = new Select(headCount);
        select.selectByValue("5");
    }
}
