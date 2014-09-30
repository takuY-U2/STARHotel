package introwork;

import core.ChromeDriverTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 入門課題その9:「テキストが表示されるまで待機してみよう」
 */
public class IntroWork9Test extends ChromeDriverTest {
    @Test
    public void testClickOKButton() throws Exception {
        File html = new File("introwork/introWork9.html");
        String url = html.toURI().toString();
        driver.get(url);

        WebElement okButton = driver.findElement(By.id("ok_button"));
        okButton.click();

        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        WebElement clickedText = driver.findElement(By.id("clicked_text"));
        try {
            wait.until(ExpectedConditions.visibilityOf(clickedText));
        } finally {
            assertThat(clickedText.getText(), is("「OK」ボタンがクリックされました!"));
        }
    }
}
