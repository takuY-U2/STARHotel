package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その7:「表示された値のチェックをしてみよう」
 * 解答例
 */
class IntroWork7Spec extends GebSpec {
    def "OneCanGetAndCheckText"() {
        when:
        File html = new File("introwork/introWork7.html")
        String url = "file:///" + html.getAbsolutePath()
        go url

        then:
        $("#total").text() == "9000"
    }
}
