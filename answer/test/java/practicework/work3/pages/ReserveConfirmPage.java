package practicework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReserveConfirmPage {
    private final WebDriver driver;
    private final By price = By.id("price");
    private final By dateFrom = By.id("datefrom");
    private final By dateTo = By.id("dateto");
    private final By daysCount = By.id("dayscount");
    private final By hc = By.id("hc");
    private final By bfOrder = By.id("bf_order");
    private final By planAOrder = By.id("plan_a_order");
    private final By planBOrder = By.id("plan_b_order");
    private final By gName = By.id("gname");
    private final By commit = By.id("commit");
        
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
    
    public String getHeadCount() {
        return driver.findElement(hc).getText();
    }
    
    public String getBreakfast() {
        return driver.findElement(bfOrder).getText();
    }
    
    public boolean existsPlanA() {
        return driver.findElements(planAOrder).size() > 0;
    }
    
    public String getPlanA() {
        return driver.findElement(planAOrder).getText();
    }
    public boolean existsPlanB() {
        return driver.findElements(planBOrder).size() > 0;
    }

    public String getPlanB() {
        return driver.findElement(planBOrder).getText();
    }
    
    public String getGuestName() {
        return driver.findElement(gName).getText();
    }
    
    public void commit() {
        driver.findElement(commit).click();
    }
}
