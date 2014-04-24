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

public class PracticeWork2Test extends ChromeDriverTest  {
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
        
        // 1ページ目入力画面
        ReserveInputPage inputPage = new ReserveInputPage(driver);
        inputPage.setReserveDate("2013", "12", "7"); // TODO 明日以降直近の土曜日に変更
        inputPage.setReserveTerm("1");
        inputPage.setHeadCount("9");
        inputPage.setBreakfast(true);
        inputPage.setPlanA(true);
        inputPage.setPlanB(true);
        inputPage.setGuestName("a");
        ReserveConfirmPage confirmPage = inputPage.goToNext();
        
        // 2ページ目入力画面
        assertThat(confirmPage.getPrice(), is("105750"));
        assertThat(confirmPage.getDateFrom(), is("2013年12月7日")); // TODO 変更
        assertThat(confirmPage.getDateTo(), is("2013年12月8日")); // TODO 変更
        assertThat(confirmPage.getDaysCount(), is("1"));
        assertThat(confirmPage.getHeadCount(), is("9"));
        assertThat(confirmPage.getBreakfast(), is("あり"));
        assertThat(confirmPage.getPlanA(), is("昼からチェックインプラン"));
        assertThat(confirmPage.getPlanB(), is("お得な観光プラン")); 
        assertThat(confirmPage.getGuestName(), is("a"));
        confirmPage.commit();
    }
}
