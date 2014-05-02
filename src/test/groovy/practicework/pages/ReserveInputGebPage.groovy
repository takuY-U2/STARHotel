package practicework.pages

import geb.Page

class ReserveInputGebPage extends Page {
    static String url = "file:///" + new File("reserveApp/index.html").absolutePath
    static content = {
        reserveYear { $("#reserve_year") }
        reserveMonth { $("#reserve_month") }
        reserveDay  { $("#reserve_day") }
        reserveTerm { $("#reserve_term") }
        goToNext(to: ReserveConfirmGebPage) { $("#goto_next") }
    }

    public void setReserveDate(int year, int month, int day) {
        reserveYear.value(year)
        reserveMonth.value(month)
        reserveDay.value(day)
    }

    public void goToNext() {
        goToNext.click()
    }
}
