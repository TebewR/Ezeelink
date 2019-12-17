package test;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.PulsaPage;
import pages.eVoucherPage;

public class PulsaTest extends BaseClass {
    @Test
    public void PulsaVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.waitPulsaDetail(driver);
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.VAPaymentPositive("PPP30");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }

    @Test
    public void PulsaMelewatiTanggalPemakaianVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoDateExpired("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaSatuKaliPemakaianVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoUsingOnce("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaSatuKaliPemakaianPerHariVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoMaxPerDay("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaStokHabisVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoEmptyQuantity("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaDigunakanOlehPenggunaLamaVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoOldUser("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaUsedSepuluhKaliVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoUsedTenTimes("PPP20");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaYangSamaLebihDariSatuKaliVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoSameMoreThanOneTimes("PPP30");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaDenganPembelianKurangDariKetentuanVA(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.swipeNormal(driver);
        pulsaPage.twoSecond();
        pulsaPage.CodePromoLessThanRules("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.EzeeGiftPaymentPositive("PPP30");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }

    @Test
    public void PulsaMelewatiTanggalPemakaianEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoDateExpiredEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaSatuKaliPemakaianEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoUsingOnceEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaSatuKaliPemakaianPerHariEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoMaxPerDayEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaStokHabisEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoEmptyQuantityEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaDigunakanOlehPenggunaLamaEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoOldUserEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaUsedSepuluhKaliEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoUsedTenTimesEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaYangSamaLebihDariSatuKaliEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoSameMoreThanOneTimesEzee("PPP30");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void PulsaDenganPembelianKurangDariKetentuanEzeegift(){
        try {
        PulsaPage pulsaPage = new PulsaPage(driver);
        pulsaPage.waitHomePage(driver);
        pulsaPage.clickPulsa();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.setTxtNumber("08111746031");
        pulsaPage.clickEnter();
        pulsaPage.waitTxtNumber(driver);
        pulsaPage.waitProgress(driver);
        pulsaPage.clickSubmit();
        pulsaPage.twoSecond();
        pulsaPage.CodePromoLessThanRulesEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
}
