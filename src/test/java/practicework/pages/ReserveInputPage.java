package practicework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReserveInputPage {
    private final WebDriver driver;
    private final By reserveYear = By.id("reserve_year");
    private final By reserveMonth = By.id("reserve_month");
    private final By reserveDay = By.id("reserve_day");
    private final By reserveTerm = By.id("reserve_term");
    private final By headCount = By.id("headcount");
    private final By breakfastOn = By.id("breakfast_on");
    private final By breakfastOff = By.id("breakfast_off");
    private final By planA = By.id("plan_a");
    private final By planB = By.id("plan_b");
    private final By guestName = By.id("guestname");
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
        WebElement element = driver.findElement(By.id("datePick"));
        element.clear();
        element.sendKeys(year +"/"+ month + "/" + day);
        element.sendKeys(Keys.RETURN);
    }

    public void setReserveTerm(String value) {
        WebElement element = driver.findElement(reserveTerm);
        element.clear();
        element.sendKeys(value);
    }
    
    public void setHeadCount(String value) {
        WebElement element = driver.findElement(headCount);
        element.clear();
        element.sendKeys(value);
    }
    
    public void setBreakfast(boolean on) {
        if (on) {
            driver.findElement(breakfastOn).click();
        } else {
            driver.findElement(breakfastOff).click();            
        }
    }
    
    public void setPlanA(boolean checked) {
        WebElement element = driver.findElement(planA);
        if (element.isSelected() != checked) {
            element.click();
        }
    }

    public void setPlanB(boolean checked) {
        WebElement element = driver.findElement(planB);
        if (element.isSelected() != checked) {
            element.click();
        }
    }

    public void setGuestName(String value) {
        WebElement element = driver.findElement(guestName);
        element.clear();
        element.sendKeys(value);
    }
    
    public ReserveConfirmPage goToNext() {
        driver.findElement(goToNext).click();
        return new ReserveConfirmPage(driver);
    }
}

