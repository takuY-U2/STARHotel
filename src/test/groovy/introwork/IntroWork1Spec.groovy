package introwork;

import geb.spock.GebSpec;

/**
 * 入門課題その1:「動かしてみよう、Selenium」
 */
class IntroWork1Spec extends GebSpec {
    def "LoginShouldSuccess"() {
        when:
        // 入門課題1のURLを取得
        File html = new File("introwork/introWork1.html")
        String url = "file:///" + html.getAbsolutePath()

        // 指定したURLのウェブページに移動
        go url

        // 文字列入力・クリックなどの処理
        Thread.sleep(1000)  // デモ用。目で見て分かりやすいように、各操作の間にSleepを入れる
        $("#user_name").value("TestUser")
        Thread.sleep(1000)  // デモ用
        $("#password").value("pass")

        then:
        Thread.sleep(1000)  // デモ用
        withAlert { $("#login").click() } == "ログインボタンが押されました"
        Thread.sleep(1000); // デモ用
    }
}
