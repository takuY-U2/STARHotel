package practicework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReserveConfirmPage {
    private final WebDriver driver;
    private final By price = By.id("price");
    private final By dateFrom = By.id("datefrom");
    private final By dateTo = By.id("dateto");
    private final By daysCount = By.id("dayscount");
        
    public ReserveConfirmPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getPrice() {
        return driver.findElement(price).getText();
    }
    
    public String getDateFrom() {
        return driver.findElement(dateFrom).getText();
    }

    public String getDateTo() {
        return driver.findElement(dateTo).getText();
    }
    
    public String getDaysCount() {
        return driver.findElement(daysCount).getText();
    }
}
