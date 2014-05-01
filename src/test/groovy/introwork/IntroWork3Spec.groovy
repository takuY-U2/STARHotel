package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その3:「文字列を入力してみよう」
 */
class IntroWork3Spec extends GebSpec {
    def "OneCanSetValue"() {
        when:
        File html = new File("introwork/introWork3.html")
        String url = "file:///" + html.getAbsolutePath()
        go url

        then:
        // TODO 以下を削除して、代わりに文字列を入力する処理を記述してください
        Thread.sleep(8000)
        // TODO ここまで削除してください
    }
}
