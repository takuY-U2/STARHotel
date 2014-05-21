package practicework;

import core.ChromeDriverTest;
import org.junit.Before;
import org.junit.Test;
import practicework.pages.ReserveInputPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PracticeWork5Test extends ChromeDriverTest {
    @Before
    public void setUp() {
        super.setUp();
        // ページ遷移の際に少し待機するため
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }
    
    @Test
    public void testCheckInitialScreen() {
        File html = new File("reserveApp_Renewal/index.html");
        String url = html.toURI().toString();
        driver.get(url);

        Calendar now = Calendar.getInstance();
        ReserveInputPage inputPage = new ReserveInputPage(driver);
        assertThat(inputPage.getReserveYear(), 
                is(Integer.toString(now.get(Calendar.YEAR))));
        assertThat(inputPage.getReserveMonth(), 
                is(Integer.toString(now.get(Calendar.MONTH) + 1)));
        assertThat(inputPage.getReserveDay(), 
                is(Integer.toString(now.get(Calendar.DATE))));
        assertThat(inputPage.getReserveTerm(), is("1"));
        assertThat(inputPage.getHeadCount(), is("1"));
        assertThat(inputPage.getBreakfast(), is(true));
        assertThat(inputPage.getPlanA(), is(false));
        assertThat(inputPage.getPlanB(), is(false));
        assertThat(inputPage.getGuestName(), is(""));
    }
}
