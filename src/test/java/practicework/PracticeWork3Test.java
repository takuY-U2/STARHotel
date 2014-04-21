package practicework;

import core.ChromeDriverTest;
import org.junit.Before;
import org.junit.Test;
import practicework.pages.ReserveConfirmPage;
import practicework.pages.ReserveInputPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PracticeWork3Test extends ChromeDriverTest {
    @Before
    public void setUp() {
        super.setUp();
        // ページ遷移の際に少し待機するため
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    @Test
    public void test() {
        File html = new File("reserveApp/index.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        ReserveInputPage inputPage = new ReserveInputPage(driver);
        inputPage.setReserveDate("2013", "12", "8"); // TODO 明日以降直近の日曜日に変更してください
        inputPage.setReserveTerm("3");
        
        // TODO 残りの処理を記述してください
        
        ReserveConfirmPage confirmPage = inputPage.goToNext();
        
        // 2ページ目入力画面
        assertThat(confirmPage.getPrice(), is("22750"));
        assertThat(confirmPage.getDateFrom(), is("2013年12月8日")); // TODO 変更してください
        assertThat(confirmPage.getDateTo(), is("2013年12月11日")); // TODO 変更してください
        assertThat(confirmPage.getDaysCount(), is("3"));

        // TODO 残りの処理を記述してください
    }
}
