package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class eVoucherPage {
    private AndroidDriver<MobileElement> driver;

    public eVoucherPage(AndroidDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.ezee.main:id/navigation_merchant")
    private MobileElement iconNavigationMerchant;

    @AndroidFindBy(id = "com.ezee.main:id/textViewBuy")
    private MobileElement txtViewBuy;

    @AndroidFindBy(id = "com.ezee.main:id/ezalert_button_positive")
    private MobileElement btnPositivePopUp;

    @AndroidFindBy(id = "com.ezee.main:id/buttonContinue")
    private MobileElement btncontinue;

    @AndroidFindBy(id = "com.ezee.main:id/textViewPromoCode")
    private MobileElement btnPromoCode;

    @AndroidFindBy(id = "com.ezee.main:id/editTextPromoCode")
    private MobileElement etPromoCode;

    @AndroidFindBy(id = "com.ezee.main:id/buttonUse")
    private MobileElement btnUse;

    @AndroidFindBy(id = "com.ezee.main:id/textViewPromoCode")
    private MobileElement chipPromo;

    @AndroidFindBy(id = "com.ezee.main:id/buttonConfirm")
    private MobileElement btnConfirm;

    @AndroidFindBy(id = "com.ezee.main:id/textViewCashbackDescription")
    private MobileElement cashbackDescription;

    @AndroidFindBy(id = "com.ezee.main:id/layoutEzeegift")
    private MobileElement ezeegiftBtn;

    @AndroidFindBy(id = "com.ezee.main:id/textViewPaymentCode")
    private MobileElement paymentCode;

    @AndroidFindBy(id = "com.ezee.main:id/imageViewBackground")
    private MobileElement ezeegiftCard;

    @AndroidFindBy(id = "com.ezee.main:id/textViewTotalBelanja")
    private MobileElement totalBelanja;

    @AndroidFindBy(id = "com.ezee.main:id/textViewTotalSaldo")
    private MobileElement totalSaldo;

    @AndroidFindBy(id = "com.ezee.main:id/buttonBayar")
    private MobileElement btnBuyEzeegift;

    @AndroidFindBy(id = "com.ezee.main:id/textViewDesc")
    private MobileElement popUpEzeegiftSuccess;

    @AndroidFindBy(id = "com.ezee.main:id/textViewError")
    private MobileElement txtViewError;

    @AndroidFindBy(id = "com.ezee.main:id/textViewAddPromoCode")
    private MobileElement addPromoCode;



    public void twoSecond(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void splashWWait(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/navigation_merchant")));
    }

    public void clickNavigation(){
        iconNavigationMerchant.click();
    }
    public void swipeCategory(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver,50);
        TouchAction touchAction = new TouchAction(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/recyclerViewCategory")));
        System.out.println("Test TouchAction" + touchAction);
        touchAction.press(PointOption.point(1011, 262))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(268, 266))
                .release()
                .perform();
    }
    public void clickMerchantCommunity(){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(1011,275))
                .release()
                .perform();
    }
    public void clickMerchant(AndroidDriver<MobileElement> driver){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(268,908))
                .release()
                .perform();
    }
    public void waitMerchantCommunity(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/squareImageView")));
    }
    public void waitPromo(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/buttonJoinMembership")));
    }
    public void waitProgress(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.ezee.main:id/smoothProgressBar")));
    }
    public void clickPromo(){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(546,665))
                .release()
                .perform();
    }
    public void waitTxtviewError(){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewError")));
    }
    public void clickBuyOutSide(){
        txtViewBuy.click();
    }

    public void clickPopUpPositive(){
        btnPositivePopUp.click();
    }

    public void clickContinue(){
        btncontinue.click();
    }

    public void swipeNormal(AndroidDriver<MobileElement> driver){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(359, 1052))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(359, 327))
                .release()
                .perform();
    }

    public void clickVA(){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(435,1422))
                .release()
                .perform();
    }
    public void btnCodePromo(){
        btnPromoCode.click();
    }

    public void setPromoCode(String promoCode){
        etPromoCode.sendKeys(promoCode);
    }

    public void clickBtnUse(){
        btnUse.click();
    }

    public void getPromoCode(){
        etPromoCode.getText();
    }

    public void getPromoCodeOutside(){
        chipPromo.getText();
    }

    public void verifyPromoCode(){
        if (chipPromo.getText().contains("MAKEITEZEE")){
            System.out.println("PROMO CODE SAME");
        }else{
            System.out.println("PROMO CODE NOT SAME");
        }
    }
    public void verifyCashback(){
        if (cashbackDescription.isDisplayed()){
            System.out.println("Cashback tampil");
        }else{
            System.out.println("Cashback tidak Tampil");
        }

    }
    public void clickConfirm(){
        btnConfirm.click();
    }

    public void verfifyPayment(){
        if (paymentCode.isDisplayed()){
            System.out.println("Payment Code Tampil");
        }else{
            System.out.println("Payment Code Tidak Tampil");
        }
    }

    public void waitUsePromo(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewPromoCode")));
    }

    public void waitEzeegiftCard(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ezee.main:id/imageViewBackground")));
    }

    public void waitPaymentCode(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewPaymentCode")));
    }

    public void clickEzeegift(){
        ezeegiftBtn.click();
    }

    public void verifyAmount(){
//        String totalB = totalBelanja.getText();
//        String totalS = totalSaldo.getText();
//        String totalB = totalBelanja.getText().replaceAll("Rp", "");
//        String totalS = totalSaldo.getText().replaceAll("Rp", "");
//        if (Integer.parseInt(totalB) < Integer.parseInt(totalS)){
//            System.out.println("Total Saldo lebih besar dari pada Total Pembelian");
//        }
        if (totalBelanja.isDisplayed() && totalSaldo.isDisplayed()){
            System.out.println("Total Belanja dan Total Saldo sudah Tampil");
        }
    }

    public void chooseEzeegift(AndroidDriver<MobileElement> driver){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(542,1292))
                .release()
                .perform();
    }

    public void clickBuyEzeegift(){
        btnBuyEzeegift.click();
    }

    public void clickAddPromoCode(){
        addPromoCode.click();
    }

    public void waitEzeeegiftPayment(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewDesc")));
    }

    public void waitBtnContinue(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/buttonContinue")));
    }

    public void waitBtnClickBuyOutside(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewBuy")));
    }

    public void waitPromoCodeBtn(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewAddPromoCode")));
    }

    public void verifyPaymentEzeegift(){
        if (popUpEzeegiftSuccess.isDisplayed()){
            System.out.println("Pop Up Payment Success");
        }else{
            System.out.println("Pop Up Payment Failed");
        }
    }
    public void VerifyTglTrasaksi(){
        //V
        if (txtViewError.getText().contains("Promo ini hanya berlaku pada tanggal [...] s.d [...]")){
            System.out.println("");
        }else{
            System.out.println("");
        }
    }

    public void VerifyMaxUsingOnce(){
        if (txtViewError.getText().contains("Promo ini hanya berlaku untuk satu kali penggunaan")){
            System.out.println("Validasi Code Promo hanya digunakan satu kali sukses");
        }else{
            System.out.println("Validasi Code Promo hanya digunakan satu kali gagal ");
        }
    }

    public void VerifyMaxUsingPerDay(){
        if (txtViewError.getText().contains("Promo ini hanya berlaku untuk satu kali penggunaan per hari")){
            System.out.println("Validasi Code Promo ");
        }else{
            System.out.println("Validasi Code Promo  ");
        }
    }

    public void VerifyEmptyQuantity(){
        if (txtViewError.getText().contains("Kuota promo sudah habis terpakai")){
            System.out.println("Validasi Code Promo ");
        }else{
            System.out.println("Validasi Code Promo ");
        }
    }

    public void VerifyUsedWitholdUser(){
        if (txtViewError.getText().contains("Promo ini hanya berlaku untuk pengguna baru")){
            System.out.println("Validasi Code Promo ");
        }else{
            System.out.println("Validasi Code Promo ");
        }
    }

    public void VerifyTenTimesTry(){
        if (popUpEzeegiftSuccess.getText().contains("Anda telah mencoba lebih dari 10x. Mohon menunggu 1 jam untuk mencoba kembali")){
            System.out.println("Validasi Code Promo ");
        }else{
            System.out.println("Validasi Code Promo ");
        }
    }

    public void VerifyWithSamePromoCode(){
        if (txtViewError.getText().contains("Kode promo sudah terpakai")){
            System.out.println("Validasi Code Promo ");
        }else{
            System.out.println("Validasi Code Promo ");
        }
    }

    public void VerifyLessThanRules(){
        if (txtViewError.getText().contains("Total pembelian belum memenuhi nilai minimum")){
            System.out.println("Validasi Code Promo ");
        }else{
            System.out.println("Validasi Code Promo ");
        }
    }

    public void VAPaymentPositive(String promoCode){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCode);
        getPromoCode();
        clickBtnUse();
        waitUsePromo(driver);
        getPromoCodeOutside();
        verifyPromoCode();
        swipeNormal(driver);
        verifyCashback();
        clickConfirm();
        waitPaymentCode(driver);
        verfifyPayment();
    }
    public void CodePromoDateExpired(String promoCodeDateExpired){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeDateExpired);
        getPromoCode();
        clickBtnUse();
        VerifyTglTrasaksi();
    }
    public void CodePromoUsingOnce(String promoCodeTwiceVA){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeTwiceVA);
        getPromoCode();
        clickBtnUse();
        VerifyMaxUsingOnce();
    }
    public void CodePromoMaxPerDay(String promoCodeMaxPerDay){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeMaxPerDay);
        getPromoCode();
        clickBtnUse();
        VerifyMaxUsingPerDay();
    }
    public void CodePromoEmptyQuantity(String promoCodeEmptyQuantity){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeEmptyQuantity);
        getPromoCode();
        clickBtnUse();
        VerifyEmptyQuantity();
    }
    public void CodePromoOldUser(String promoCodeOldUser){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeOldUser);
        getPromoCode();
        clickBtnUse();
        VerifyUsedWitholdUser();
    }
    public void CodePromoUsedTenTimes(String promoCodeTenTimes){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeTenTimes);
        getPromoCode();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        VerifyTenTimesTry();
    }
    public void CodePromoSameMoreThanOneTimes(String promoCodeMoreOneTimes){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeMoreOneTimes);
        getPromoCode();
        clickBtnUse();
        waitPromoCodeBtn(driver);
        clickAddPromoCode();
        setPromoCode(promoCodeMoreOneTimes);
        clickBtnUse();
        VerifyWithSamePromoCode();
    }
    public void CodePromoLessThanRules(String promoCodeLessThanRules){
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeLessThanRules);
        getPromoCode();
        clickBtnUse();
        VerifyLessThanRules();
    }

    public void EzeeGiftPaymentPositive(String promoCode){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCode);
        getPromoCode();
        clickBtnUse();
        waitUsePromo(driver);
        getPromoCodeOutside();
        verifyPromoCode();
        swipeNormal(driver);
        verifyCashback();
        clickConfirm();
        waitEzeeegiftPayment(driver);
        verifyPaymentEzeegift();
    }

    public void CodePromoUsingOnceEzee(String promoCodeTwiceEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeTwiceEzee);
        getPromoCode();
        clickBtnUse();
        VerifyMaxUsingOnce();
    }
    public void CodePromoDateExpiredEzee(String promoCodeDateExpiredEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeDateExpiredEzee);
        getPromoCode();
        clickBtnUse();
        VerifyTglTrasaksi();
    }
    public void CodePromoMaxPerDayEzee(String promoCodeMaxPerDayEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeMaxPerDayEzee);
        getPromoCode();
        clickBtnUse();
        VerifyMaxUsingPerDay();
    }
    public void CodePromoEmptyQuantityEzee(String promoCodeEmptyQuantityEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeEmptyQuantityEzee);
        getPromoCode();
        clickBtnUse();
        VerifyEmptyQuantity();
    }
    public void CodePromoOldUserEzee(String promoCodeOldUserEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeOldUserEzee);
        getPromoCode();
        clickBtnUse();
        VerifyUsedWitholdUser();
    }
    public void CodePromoUsedTenTimesEzee(String promoCodeTenTimesEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeTenTimesEzee);
        getPromoCode();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        clickBtnUse();
        waitTxtviewError();
        VerifyTenTimesTry();
    }
    public void CodePromoSameMoreThanOneTimesEzee(String promoCodeMoreOneTimesEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeMoreOneTimesEzee);
        getPromoCode();
        clickBtnUse();
        waitPromoCodeBtn(driver);
        clickAddPromoCode();
        setPromoCode(promoCodeMoreOneTimesEzee);
        getPromoCode();
        clickBtnUse();
        VerifyWithSamePromoCode();
    }
    public void CodePromoLessThanRulesEzee(String promoCodeLessThanRulesEzee){
        clickEzeegift();
        waitEzeegiftCard(driver);
        chooseEzeegift(driver);
        verifyAmount();
        clickBuyEzeegift();
        swipeNormal(driver);
        clickVA();
        btnCodePromo();
        setPromoCode(promoCodeLessThanRulesEzee);
        getPromoCode();
        clickBtnUse();
        VerifyLessThanRules();
    }
}
