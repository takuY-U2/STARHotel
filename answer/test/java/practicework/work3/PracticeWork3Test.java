package practicework;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practicework.pages.ReserveConfirmPage;
import practicework.pages.ReserveInputPage;

public class PracticeWork3Test extends ChromeDriverTest {
    @Before
    public void setUp() {
        super.setUp();
        // ページ遷移の際に少し待機するため
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testReserveWith1Member() {
        File html = new File("reserveApp/index.html");
        String url = html.toURI().toString();
        driver.get(url);
        
        ReserveInputPage inputPage = new ReserveInputPage(driver);
        inputPage.setReserveDate("2013", "12", "8"); // TODO 明日以降直近の日曜日に変更
        inputPage.setReserveTerm("3");
        inputPage.setHeadCount("1");
        inputPage.setBreakfast(false);
        inputPage.setPlanA(false);
        inputPage.setPlanB(false);
        inputPage.setGuestName("abcd");
        ReserveConfirmPage confirmPage = inputPage.goToNext();
        
        // 2ページ目入力画面
        assertThat(confirmPage.getPrice(), is("22750"));
        assertThat(confirmPage.getDateFrom(), is("2013年12月8日")); // TODO 変更
        assertThat(confirmPage.getDateTo(), is("2013年12月11日")); // TODO 変更
        assertThat(confirmPage.getDaysCount(), is("3"));
        assertThat(confirmPage.getHeadCount(), is("1"));
        assertThat(confirmPage.getBreakfast(), is("なし"));
        assertThat(confirmPage.existsPlanA(), is(false));
        assertThat(confirmPage.existsPlanB(), is(false));
        assertThat(confirmPage.getGuestName(), is("abcd"));
        confirmPage.commit();   
    }
}
