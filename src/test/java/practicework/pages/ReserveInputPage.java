package practicework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReserveInputPage {
    private final WebDriver driver;
    private final By reserveYear = By.id("reserve_year");
    private final By reserveMonth = By.id("reserve_month");
    private final By reserveDay = By.id("reserve_day");
    private final By reserveTerm = By.id("reserve_term");
    private final By goToNext = By.id("goto_next");

    public ReserveInputPage(WebDriver driver) {
        this.driver = driver;
    }

    private void setReserveYear(String value) {
        WebElement element = driver.findElement(reserveYear);
        element.clear();
        element.sendKeys(value);
    }

    private void setReserveMonth(String value) {
        WebElement element = driver.findElement(reserveMonth);
        element.clear();
        element.sendKeys(value);
    }

    private void setReserveDay(String value) {
        WebElement element = driver.findElement(reserveDay);
        element.clear();
        element.sendKeys(value);
    }
    
    public void setReserveDate(String year, String month, String day) {
        setReserveYear(year);
        setReserveMonth(month);
        setReserveDay(day);
    }

    public void setReserveTerm(String value) {
        WebElement element = driver.findElement(reserveTerm);
        element.clear();
        element.sendKeys(value);
    }
    
    public ReserveConfirmPage goToNext() {
        driver.findElement(goToNext).click();
        return new ReserveConfirmPage(driver);
    }
}
