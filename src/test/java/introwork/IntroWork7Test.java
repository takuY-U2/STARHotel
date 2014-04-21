package introwork;

import core.ChromeDriverTest;
import org.junit.Test;

import java.io.File;

/**
 * 入門課題その7:「表示された値のチェックをしてみよう」
 */
public class IntroWork7Test extends ChromeDriverTest {
   @Test
    public void testGetAndCheckText() throws Exception {
        File html = new File("introwork/introWork7.html");
        String url = "file:///" + html.getAbsolutePath();
        driver.get(url);
        
        // TODO 以下を削除して、代わりにプルダウンを選択する処理を記述してください
        Thread.sleep(8000);
        // TODO ここまで削除してください
    }
}
