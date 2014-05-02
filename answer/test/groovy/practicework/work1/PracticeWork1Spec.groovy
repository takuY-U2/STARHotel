package practicework

import geb.spock.GebSpec
import util.CalendarUtility

class PracticeWork1Spec extends GebSpec {
    def "OnetCanReserveWith9Members"() {
        when:
        File html = new File("reserveApp/index.html")
        String url = "file:///" + html.absolutePath
        go url

        // 現在のシステム日付を起点に明日以降の直近の土曜日を取得します
        Calendar immediateSaturday = CalendarUtility.getImmediateDayOfWeek(Calendar.getInstance(), Calendar.SATURDAY)
        int reserveYear = immediateSaturday.get(Calendar.YEAR)
        int reserveMonth = immediateSaturday.get(Calendar.MONTH) + 1
        int reserveDay = immediateSaturday.get(Calendar.DAY_OF_MONTH)

        // 上記で取得した直近の土曜日を使用します
        $("#reserve_year").value(reserveYear)
        $("#reserve_month").value(reserveMonth)
        $("#reserve_day").value(reserveDay)
        $("#reserve_term").value("1")
        $("#headcount").value("9")
        $("#breakfast_on").click()
        $("#plan_a").value(true)
        $("#plan_b").value(true)
        $("#guestname").value("a")
        $("#goto_next").click()

        then:
        $("#price").text() == "105750"
        $("#datefrom").text() ==  reserveYear + "年" + reserveMonth + "月" + reserveDay + "日"
        $("#dateto").text() == reserveYear + "年" + reserveMonth + "月" + (reserveDay + 1) + "日"
        $("#dayscount").text() == "1"
        $("#hc").text() == "9"
        $("#bf_order").text() == "あり"
        $("#plan_a_order").text() ==  "昼からチェックインプラン"
        $("#plan_b_order").text() == "お得な観光プラン"
        $("#gname").text() ==  "a"
        $("#commit").click()
   }
}
