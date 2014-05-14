package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その5:「チェックボックスを選択してみよう」
 * 解答例
 */
class IntroWork5Spec extends GebSpec {
    def "OneCanSetCheckbox"() {
        when:
        File html = new File("introwork/introWork5.html")
        String url = html.toURI().toString()
        go url

        then:
        $("#allowed_check").value(true)
    }
}
