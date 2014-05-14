package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その2:「クリックしてみよう」
 */
class IntroWork2Spec extends GebSpec {
    def "OneCanClickOKButton"() {
        when:
        File html = new File("introwork/introWork2.html")
        String url = html.toURI().toString()
        go url

        then:
        // TODO 以下を削除して、代わりに文字列を入力する処理を記述してください
        Thread.sleep(8000)
        // TODO ここまで削除してください
    }
}
