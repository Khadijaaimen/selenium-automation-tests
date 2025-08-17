package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testIncreaseSliderValue(){
        var sliderPage = homePage.clickSlider();
        sliderPage.increaseSliderValue(4);
        var range = sliderPage.getSliderValue();

        assertEquals(range, "4", "Incorrect range value");
    }
}
