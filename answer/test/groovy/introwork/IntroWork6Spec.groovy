package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その6:「プルダウンを選択してみよう」
 * 解答例
 */
class IntroWork6Spec extends GebSpec {
    def "OneCanSelectOptionByValue"() {
        when:
        File html = new File("introwork/introWork6.html")
        String url = html.toURI().toString()
        go url

        then:
        $("#head_count").value("5")
    }
}
