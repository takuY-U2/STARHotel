package introwork;

import core.ChromeDriverTest;
import org.junit.Test;

import java.io.File;

/**
 * 入門課題その2:「クリックしてみよう」
 */
public class IntroWork8Test extends ChromeDriverTest {
    @Test
    public void testClickOKButton() throws Exception {
        File html = new File("introwork/introWork8.html");
        String url = html.toURI().toString();
        driver.get(url);

        // TODO 以下を削除して、代わりに「Last」ボタンまでスクロールする処理を記述してください
        Thread.sleep(8000);
        // TODO ここまで削除してください
    }
}
