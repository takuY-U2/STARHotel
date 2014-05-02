package practicework.pages

import geb.Page;

public class ReserveInputGebPage extends Page {
    static String url = "file:///" + new File("reserveApp/index.html").absolutePath
    static content = {
        reserveYear { $("#reserve_year") }
        reserveMonth { $("#reserve_month") }
        reserveDay  { $("#reserve_day") }
        reserveTerm { $("#reserve_term") }
        headCount { $("#headcount") }
        breakfastOn { $("#breakfast_on") }
        breakfastOff { $("#breakfast_off") }
        planA { $("#plan_a") }
        planB { $("#plan_b") }
        guestName { $("#guestname") }
        goToNext(to: ReserveConfirmGebPage) { $("#goto_next") }
    }

    public void setReserveDate(int year, int month, int day) {
        reserveYear.value(year)
        reserveMonth.value(month)
        reserveDay.value(day)
    }

    public void setBreakfast(boolean on) {
        if (on) {
            breakfastOn.click()
        } else {
            breakfastOff.click()
        }
    }
    
    public void goToNext() {
        goToNext.click()
    }
}
