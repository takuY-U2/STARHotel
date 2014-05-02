package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その6:「プルダウンを選択してみよう」
 */
class IntroWork6Spec extends GebSpec {
    def "OneCanSelectOptionByValue"() {
        when:
        File html = new File("introwork/introWork6.html")
        String url = "file:///" + html.absolutePath
        go url

        then:
        // TODO 以下を削除して、代わりに文字列を入力する処理を記述してください
        Thread.sleep(8000)
        // TODO ここまで削除してください
    }
}
