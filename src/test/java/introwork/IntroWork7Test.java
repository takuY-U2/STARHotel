package introwork;

import core.ChromeDriverTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.io.File;

/**
 * 入門課題その7:「表示された値のチェックをしてみよう」
 */
public class IntroWork7Test extends ChromeDriverTest {
    @Test
    public void testGetAndCheckText() throws Exception {
        File html = new File("introwork/introWork7.html");
        String url = html.toURI().toString();
        driver.get(url);

        WebElement total = driver.findElement(By.id("total"));
        assertThat(total.getText(),is("9000"));
    }
}
