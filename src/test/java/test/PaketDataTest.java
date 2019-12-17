package test;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.PaketDataPage;

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
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataMelewatiTanggalPemakaianVA(){
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
            paketDataPage.CodePromoDateExpired("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataSatuKaliPemakaianVA() {
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
            paketDataPage.CodePromoUsingOnce("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        } catch (Exception e) {
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataSatuKaliPemakaianPerHariVA(){
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
            paketDataPage.CodePromoMaxPerDay("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataStokHabisVA(){
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
            paketDataPage.CodePromoEmptyQuantity("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataDigunakanOlehPenggunaLamaVA(){
        try {
            PaketDataPage paketDataPage = new PaketDataPage(driver);
            paketDataPage.waitHomePage(driver);
            paketDataPage.clickPaketData();
            paketDataPage.waitTxtNumber(driver);
            paketDataPage.setTxtNumber("08111746031");
            paketDataPage.clickEnter();
            paketDataPage.waitProgress(driver);
            paketDataPage.swipePaketData(driver);
            paketDataPage.clickSubmit();
            paketDataPage.twoSecond();
            paketDataPage.swipeNormal(driver);
            paketDataPage.CodePromoOldUser("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataUsedSepuluhKaliVA(){
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
            paketDataPage.CodePromoUsedTenTimes("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataYangSamaLebihDariSatuKaliVA(){
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
            paketDataPage.CodePromoSameMoreThanOneTimes("PPP30");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataDenganPembelianKurangDariKetentuanVA(){
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
            paketDataPage.CodePromoLessThanRules("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataEzeegift(){
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
            paketDataPage.EzeeGiftPaymentPositive("PPP30");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataMelewatiTanggalPemakaianEzee(){
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
            paketDataPage.CodePromoDateExpiredEzee("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }

    @Test
    public void PaketDataSatuKaliPemakaianEzee(){
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
            paketDataPage.CodePromoUsingOnceEzee("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataSatuKaliPemakaianPerHariEzee(){
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
            paketDataPage.CodePromoMaxPerDayEzee("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataStokHabisEzee(){
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
            paketDataPage.CodePromoEmptyQuantityEzee("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataDigunakanOlehPenggunaLamaEzee(){
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
            paketDataPage.CodePromoOldUserEzee("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataUsedSepuluhKaliEzee(){
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
            paketDataPage.CodePromoUsedTenTimesEzee("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataYangSamaLebihDariSatuKaliEzee(){
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
            paketDataPage.CodePromoSameMoreThanOneTimesEzee("PPP30");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PaketDataDenganPembelianKurangDariKetentuanEzee(){
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
            paketDataPage.CodePromoLessThanRulesEzee("");
            ((AndroidDriver) driver).closeApp();
            paketDataPage.twoSecond();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
}
