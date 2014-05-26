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
        planA { $("#plan_a_order") }
        planB { $("#plan_b_order") }
        guestName { $("#gname") }
        commit { $("#commit") }
    }
        
    public void commit() {
        commit.click()
    }
}
