package practicework;

import core.ChromeDriverTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PracticeWork1Test extends ChromeDriverTest {
    @Before
    public void setUp() {
        super.setUp();
        // ページ遷移の際に少し待機するため
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

   @Test
    public void test() throws Exception {
        File html = new File("reserveApp/index.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        // TODO 以下は削除してください
        Thread.sleep(8000);
        // TODO ここまで削除してください
        
        // 1ページ目入力画面
        driver.findElement(By.id("reserve_year")).clear();
        driver.findElement(By.id("reserve_year")).sendKeys("2013"); // TODO 明日以降直近の土曜日に変更してください
        driver.findElement(By.id("reserve_month")).clear();
        driver.findElement(By.id("reserve_month")).sendKeys("12"); // TODO 明日以降直近の土曜日に変更してください
        driver.findElement(By.id("reserve_day")).clear();
        driver.findElement(By.id("reserve_day")).sendKeys("7"); // TODO 明日以降直近の土曜日に変更してください
        driver.findElement(By.id("reserve_term")).clear();
        driver.findElement(By.id("reserve_term")).sendKeys("1");
        
        // TODO 残りの処理を記述してください

        // 2ページ目入力画面
        assertThat(driver.findElement(By.id("price")).getText(), is("105750"));
        assertThat(driver.findElement(By.id("datefrom")).getText(), is("2013年12月7日")); // TODO 変更してください
        assertThat(driver.findElement(By.id("dateto")).getText(), is("2013年12月8日")); // TODO 変更してください
        assertThat(driver.findElement(By.id("dayscount")).getText(), is("1"));

        // TODO 残りの処理を記述してください
    }
}
