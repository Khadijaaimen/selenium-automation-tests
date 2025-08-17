package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SliderPage {

    public WebDriver driver;
    public By sliderContainer = By.cssSelector("input[type='range']");
    public By rangeText = By.id("range");

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void increaseSliderValue(int value){
        WebElement slider = driver.findElement(sliderContainer);
        int clicks = value * 2;
        if(clicks <=10) {
            for (int i = 1; i <= clicks; i++) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
        }
    }

    public String getSliderValue(){
        return driver.findElement(rangeText).getText();
    }
}
