package introwork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 入門課題その7:「表示された値のチェックをしてみよう」
 * 解答例
 */
public class IntroWork7 extends ChromeDriverTest {
    @Test
    public void testGetAndCheckText() throws Exception {
        File html = new File("introwork/introWork7.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        WebElement total = driver.findElement(By.id("total"));
        assertThat(total.getText(), is("9000"));
    }
}
