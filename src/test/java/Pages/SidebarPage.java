package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SidebarPage {

    WebDriver driver;

    WebElement sideBardItems;

    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getSideBardItems() {
        return driver.findElements(By.className("text"));
    }


    //------------

    public void clickOnItemFromSidebar (String itemName) {
        for(int i = 0; i < getSideBardItems().size(); i++) {
            if(getSideBardItems().get(i).getText().equals(itemName)) {
                getSideBardItems().get(i).click();
                break;
            }
        }
    }
}
