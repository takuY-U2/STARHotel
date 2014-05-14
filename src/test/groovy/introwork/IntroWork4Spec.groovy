package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その4:「ラジオボタンを選択してみよう」
 */
class IntroWork4Spec extends GebSpec {
    def "OneCanClickRadioButton"() {
        when:
        File html = new File("introwork/introWork4.html")
        String url = html.toURI().toString()
        go url

        then:
        // TODO 以下を削除して、代わりに文字列を入力する処理を記述してください
        Thread.sleep(8000)
        // TODO ここまで削除してください
    }
}
