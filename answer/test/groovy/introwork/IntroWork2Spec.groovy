package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その2:「クリックしてみよう」
 * 解答例
 */
class IntroWork2Spec extends GebSpec {
    def "OneCanClickOKButton"() {
        when:
        File html = new File("introwork/introWork2.html");
        String url = "file:///" + html.getAbsolutePath();
        go url

        then:
        $("#ok_button").click()
    }
}
