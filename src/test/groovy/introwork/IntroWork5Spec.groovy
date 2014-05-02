package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その5:「チェックボックスを選択してみよう」
 */
class IntroWork5Spec extends GebSpec {
    def "OneCanSetCheckbox"() {
        when:
        File html = new File("introwork/introWork5.html")
        String url = "file:///" + html.absolutePath
        go url

        then:
        // TODO 以下を削除して、代わりに文字列を入力する処理を記述してください
        Thread.sleep(8000)
        // TODO ここまで削除してください
    }
}
