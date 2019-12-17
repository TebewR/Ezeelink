package test;
import io.appium.java_client.android.AndroidDriver;
import pages.eVoucherPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class eVoucherTest extends BaseClass {

    @Test
    public void eVoucherVA(){
        try {
            eVoucherPage evoucherPage = new eVoucherPage(driver);
            evoucherPage.splashWWait(driver);
            evoucherPage.clickNavigation();
            evoucherPage.swipeCategory(driver);
            evoucherPage.clickMerchantCommunity();
            evoucherPage.waitMerchantCommunity(driver);
            evoucherPage.clickMerchant(driver);
            evoucherPage.waitPromo(driver);
            evoucherPage.clickPromo();
            evoucherPage.twoSecond();
            evoucherPage.clickBuyOutSide();
            evoucherPage.clickPopUpPositive();
            evoucherPage.waitBtnContinue(driver);
            evoucherPage.clickContinue();
            evoucherPage.swipeNormal(driver);
            evoucherPage.VAPaymentPositive("MAKEITEZEE");
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }

    @Test
    public void eVoucherMelewatiTanggalPemakaianVA(){
        try {
            eVoucherPage evoucherPage = new eVoucherPage(driver);
            evoucherPage.splashWWait(driver);
            evoucherPage.clickNavigation();
            evoucherPage.swipeCategory(driver);
            evoucherPage.clickMerchantCommunity();
            evoucherPage.waitMerchantCommunity(driver);
            evoucherPage.clickMerchant(driver);
            evoucherPage.waitPromo(driver);
            evoucherPage.clickPromo();
            evoucherPage.twoSecond();
            evoucherPage.clickBuyOutSide();
            evoucherPage.clickPopUpPositive();
            evoucherPage.waitBtnContinue(driver);
            evoucherPage.clickContinue();
            evoucherPage.swipeNormal(driver);
            evoucherPage.CodePromoDateExpired("");
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherSatuKaliPemakaianVA(){
        try {
            eVoucherPage evoucherPage = new eVoucherPage(driver);
            evoucherPage.splashWWait(driver);
            evoucherPage.clickNavigation();
            evoucherPage.swipeCategory(driver);
            evoucherPage.clickMerchantCommunity();
            evoucherPage.waitMerchantCommunity(driver);
            evoucherPage.clickMerchant(driver);
            evoucherPage.waitPromo(driver);
            evoucherPage.clickPromo();
            evoucherPage.twoSecond();
            evoucherPage.clickBuyOutSide();
            evoucherPage.clickPopUpPositive();
            evoucherPage.waitBtnContinue(driver);
            evoucherPage.clickContinue();
            evoucherPage.swipeNormal(driver);
            evoucherPage.CodePromoUsingOnce("");
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }catch (Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherSatuKaliPemakaianPerHariVA(){
        try {
            eVoucherPage evoucherPage = new eVoucherPage(driver);
            evoucherPage.splashWWait(driver);
            evoucherPage.clickNavigation();
            evoucherPage.swipeCategory(driver);
            evoucherPage.clickMerchantCommunity();
            evoucherPage.waitMerchantCommunity(driver);
            evoucherPage.clickMerchant(driver);
            evoucherPage.waitPromo(driver);
            evoucherPage.clickPromo();
            evoucherPage.twoSecond();
            evoucherPage.clickBuyOutSide();
            evoucherPage.clickPopUpPositive();
            evoucherPage.waitBtnContinue(driver);
            evoucherPage.clickContinue();
            evoucherPage.swipeNormal(driver);
            evoucherPage.CodePromoMaxPerDay("");
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherStokHabisVA(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoEmptyQuantity("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherDigunakanOlehPenggunaLamaVA(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoOldUser("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherUsedSepuluhKaliVA(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoUsedTenTimes("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherYangSamaLebihDariSatuKaliVA(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoSameMoreThanOneTimes("MAKEITEZEE");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherDenganPembelianKurangDariKetentuanVA(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoLessThanRules("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.EzeeGiftPaymentPositive("PPP30");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherMelewatiTanggalPemakaianEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoDateExpiredEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherSatuKaliPemakaianEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoUsingOnceEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherSatuKaliPemakaianPerHariEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoMaxPerDayEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherStokHabisEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoEmptyQuantityEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherDigunakanOlehPenggunaLamaEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoOldUserEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherUsedSepuluhKaliEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoUsedTenTimesEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherYangSamaLebihDariSatuKaliEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoSameMoreThanOneTimesEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
    @Test
    public void eVoucherDenganPembelianKurangDariKetentuanEzeegift(){
        try {
        eVoucherPage evoucherPage = new eVoucherPage(driver);
        evoucherPage.splashWWait(driver);
        evoucherPage.clickNavigation();
        evoucherPage.swipeCategory(driver);
        evoucherPage.clickMerchantCommunity();
        evoucherPage.waitMerchantCommunity(driver);
        evoucherPage.clickMerchant(driver);
        evoucherPage.waitPromo(driver);
        evoucherPage.clickPromo();
        evoucherPage.twoSecond();
        evoucherPage.clickBuyOutSide();
        evoucherPage.clickPopUpPositive();
        evoucherPage.waitBtnContinue(driver);
        evoucherPage.clickContinue();
        evoucherPage.swipeNormal(driver);
        evoucherPage.CodePromoLessThanRulesEzee("");
        ((AndroidDriver) driver).closeApp();
        driver.launchApp();
        }catch(Exception e){
            e.printStackTrace();
            ((AndroidDriver) driver).closeApp();
            driver.launchApp();
        }
    }
}
