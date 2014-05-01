package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その4:「ラジオボタンを選択してみよう」
 * 解答例
 */
class IntroWork4Spec extends GebSpec {
    def "OneCanClickRadioButton"() {
        when:
        File html = new File("introwork/introWork4.html")
        String url = "file:///" + html.getAbsolutePath()
        go url

        then:
        $("#on_radio").click()
    }
}
