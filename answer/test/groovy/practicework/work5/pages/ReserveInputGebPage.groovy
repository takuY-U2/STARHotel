package practicework.pages

import geb.Page
import org.openqa.selenium.Keys;

class ReserveInputGebPage extends Page {
    static String url = "file:///" + new File("reserveApp_Renewal/index.html").toURI().toString()
    static content = {
        datePick { $("#datePick") }
        reserveYear { $("#reserve_year")}
        reserveMonth { $("#reserve_month")}
        reserveDay { $("#reserve_day")}
        reserveTerm { $("#reserve_term") }
        headCount { $("#headcount") }
        breakfastOn { $("#breakfast_on") }
        breakfastOff { $("#breakfast_off") }
        planA { $("#plan_a") }
        planB { $("#plan_b") }
        guestName { $("#guestname") }
        goToNext(to: ReserveConfirmGebPage) { $("#agree_and_goto_next") }
    }

    public void setReserveDate(int year, int month, int day) {
        datePick.value(year + "/" + month + "/" + day)
        datePick << Keys.RETURN
    }

    public void setBreakfast(boolean on) {
        if (on) {
            breakfastOn.click()
        } else {
            breakfastOff.click()
        }
    }

    public boolean getBreakfast() {
        return breakfastOn.attr("checked") == "true" ? true : false
    }
    public void goToNext() {
        goToNext.click()
    }
}
