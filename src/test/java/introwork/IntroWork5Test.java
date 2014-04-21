package introwork;

import core.ChromeDriverTest;
import org.junit.Test;

import java.io.File;

/**
 * 入門課題その5:「チェックボックスを選択してみよう」
 */
public class IntroWork5Test extends ChromeDriverTest {
   @Test
    public void testClickCheckbox() throws Exception {
        File html = new File("introwork/introWork5.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        // TODO 以下を削除して、代わりにチェックボックスを選択する処理を記述ください
        Thread.sleep(8000);
        // TODO ここまで削除してください
    }
}
