package test;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.PaketDataPage;
import org.testng.Assert;

public class PaketDataTest extends BaseClass{
    @Test
    public void PaketDataVA() {
        try {
            PaketDataPage paketDataPage = new PaketDataPage(driver);
            paketDataPage.waitHomePage(driver);
            paketDataPage.clickPaketData();
            paketDataPage.waitTxtNumber(driver);
            paketDataPage.setTxtNumber("08111746031");
            paketDataPage.clickEnter();
            paketDataPage.waitProgress(driver);
            paketDataPage.swipePaketData(driver);
            paketDataPage.twoSecond();
            paketDataPage.clickSubmit();
            paketDataPage.twoSecond();
            paketDataPage.swipeNormal(driver);
            paketDataPage.VAPaymentPositive("PPP30");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            Assert.fail();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
}
