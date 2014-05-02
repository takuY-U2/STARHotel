package practicework.pages

import geb.Page;

public class ReserveConfirmGebPage extends Page {
    static String url = "file:///" + new File("reserveApp/check_info.html").absolutePath
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
