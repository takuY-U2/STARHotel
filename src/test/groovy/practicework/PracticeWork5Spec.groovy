package practicework

import geb.spock.GebSpec
import practicework.pages.ReserveConfirmGebPage
import practicework.pages.ReserveInputGebPage
import util.CalendarUtility

class PracticeWork5Spec extends GebSpec {
    def "InitialScreenShouldHaveDefaultValues"() {
        when:
        ReserveInputGebPage reserveInputGebPage = browser.to ReserveInputGebPage

        Calendar now = Calendar.getInstance()
        int reserveYear = now.get(Calendar.YEAR)
        int reserveMonth = now.get(Calendar.MONTH) + 1
        int reserveDay = now.get(Calendar.DAY_OF_MONTH)

        then:
        reserveInputGebPage.reserveYear == reserveYear as String

        // TODO 初期値チェック処理を記述してください
   }
}
