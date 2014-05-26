package practicework.pages

import geb.Page;

class ReserveConfirmGebPage extends Page {
    static String url = new File("reserveApp/check_info.html").toURI().toString()
    static at = { title == "Reservation" }
    static content = {
        price { $("#price") }
        dateFrom { $("#datefrom") }
        dateTo { $("#dateto") }
        daysCount { $("#dayscount") }
        headCount { $("#hc") }
        breakfast { $("#bf_order") }
        planA(required: false) { $("#plan_a_order") }
        planB(required: false) { $("#plan_b_order") }
        guestName { $("#gname") }
        commit { $("#commit") }
    }

    public boolean existsPlanA() {
        planA.size() > 0;
    }

    public boolean existsPlanB() {
        planB.size() > 0;
    }

    public void commit() {
        commit.click()
    }
}
