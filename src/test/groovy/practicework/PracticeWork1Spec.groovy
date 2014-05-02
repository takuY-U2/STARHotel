package practicework

import geb.spock.GebSpec
import util.CalendarUtility

class PracticeWork1Spec extends GebSpec {
    def "OnetCanReserveWith9MembersUsingCalendarUtility"() {
        when:
        File html = new File("reserveApp/index.html")
        String url = "file:///" + html.getAbsolutePath()
        go url

        // TODO 以下は削除してください
        Thread.sleep(8000)
        // TODO ここまで削除してください

        // 現在のシステム日付を起点に明日以降の直近の土曜日を取得します
        Calendar immediateSaturday = CalendarUtility.getImmediateDayOfWeek(Calendar.getInstance(), Calendar.SATURDAY);
        int reserveYear = immediateSaturday.get(Calendar.YEAR)
        int reserveMonth = immediateSaturday.get(Calendar.MONTH) + 1
        int reserveDay = immediateSaturday.get(Calendar.DAY_OF_MONTH)

        // 上記で取得した直近の土曜日を使用します
        $("#reserve_year").value(reserveYear)
        $("#reserve_month").value(reserveMonth)
        $("#reserve_day").value(reserveDay)
        $("#reserve_term").value("1")

        // TODO 残りの処理を記述してください

        then:
        $("#price").text() == "105750"
        $("#datefrom").text() ==  reserveYear + "年" + reserveMonth + "月" + reserveDay + "日"
        $("#dateto").text() == reserveYear + "年" + reserveMonth + "月" + (reserveDay + 1) + "日"
        $("#dayscount").text() == "1"

        // TODO 残りの処理を記述してください
   }
}
