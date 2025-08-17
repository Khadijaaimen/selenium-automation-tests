package cookie;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;


public class CookiesTests extends BaseTests {

    @Test
    public void testDeleteCookies(){
        var cookieManager = getCookieManager();
        cookieManager.addCookie(new Cookie("tau", "123"));
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
