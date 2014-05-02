package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その3:「文字列を入力してみよう」
 * 解答例
 */
class IntroWork3Spec extends GebSpec {
    def "OneCanSetValue"() {
        when:
        File html = new File("introwork/introWork3.html")
        String url = "file:///" + html.absolutePath
        go url

        then:
        $("#subject").value("Geb")
    }
}
