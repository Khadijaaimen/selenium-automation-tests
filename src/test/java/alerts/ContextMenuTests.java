package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextPage = homePage.clickContextMenu();
        contextPage.clickContextMenu();
        String result = contextPage.getAlertText();
        contextPage.alert_clickAccept();

        assertEquals(result, "You selected a context menu", "Incorrect alert text");
    }
}
