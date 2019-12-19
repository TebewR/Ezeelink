//package test;
//
//import io.appium.java_client.android.AndroidDriver;
//import org.testng.annotations.Test;
//import pages.PLNPage;
//import pages.PulsaPage;
//
//public class  PLNTest extends BaseClass{
//    @Test
//    public void PLNVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//        plnPage.waitHomePage(driver);
//        plnPage.clickPLN(driver);
//        plnPage.waitPLN(driver);
//        plnPage.waitProgress(driver);
//        plnPage.setPLNNumber("14234567895");
//        plnPage.clickEnter();
//        plnPage.clickSubmit();
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//
//    @Test
//    public void PLNMelewatiTanggalPemakaianVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNSatuKaliPemakaianVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNSatuKaliPemakaianPerHariVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNStokHabisVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNDigunakanOlehPenggunaLamaVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNUsedSepuluhKaliVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNYangSamaLebihDariSatuKaliVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNDenganPembelianKurangDariKetentuanVA(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//
//    @Test
//    public void PLNMelewatiTanggalPemakaianEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNSatuKaliPemakaianEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNSatuKaliPemakaianPerHariEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNstokHabisEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNDigunakanOlehPenggunaLamaEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNsedSepuluhKaliEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNYangSamaLebihDariSatuKaliEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//    @Test
//    public void PLNDenganPembelianKurangDariKetentuanEzeegift(){
//        try {
//        PLNPage plnPage = new PLNPage(driver);
//
//        ((AndroidDriver) driver).closeApp();
//        driver.launchApp();
//        }catch(Exception e){
//            e.printStackTrace();
//            ((AndroidDriver) driver).closeApp();
//            driver.launchApp();
//        }
//    }
//}
