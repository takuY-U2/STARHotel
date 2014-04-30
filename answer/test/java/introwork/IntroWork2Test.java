
package introwork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

/**
 * 入門課題その2:「クリックしてみよう」
 * 解答例
 */
public class IntroWork2 extends ChromeDriverTest {
   @Test
    public void testClickOKButton() throws Exception {
        File html = new File("introwork/introWork2.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        WebElement okButton = driver.findElement(By.id("ok_button"));
        okButton.click();
    }
}
