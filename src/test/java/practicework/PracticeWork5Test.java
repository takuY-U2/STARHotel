package practicework;

import core.ChromeDriverTest;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class PracticeWork5Test extends ChromeDriverTest {
    @Before
    public void setUp() {
        super.setUp();
        // ページ遷移の際に少し待機するため
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }
    
    @Test
    public void test() {        
        File html = new File("reserveApp_Renewal/index.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        // TODO 初期値チェック処理を記述してください
    }
}
