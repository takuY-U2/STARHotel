package introwork;

import org.junit.Test;
import core.ChromeDriverTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

/**
 * 入門課題その4:「ラジオボタンを選択してみよう」
 * 解答例
 */
public class IntroWork4Test extends ChromeDriverTest {
    @Test
    public void testClickRadioButton() throws Exception {
        File html = new File("introwork/introWork4.html");
        String url = html.toURI().toString();
        driver.get(url);

        WebElement onRadio = driver.findElement(By.id("on_radio"));
        onRadio.click();
    }
}
