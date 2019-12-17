package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PulsaPage {
    private static AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;
    public PulsaPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.ezee.main:id/imageView")
    private MobileElement iconPulsa;

    @AndroidFindBy(id = "com.ezee.main:id/editTextPhone")
    private MobileElement txtNumber;

    @AndroidFindBy(id = "com.ezee.main:id/textViewName")
    private MobileElement txtViewName;

    @AndroidFindBy(id = "com.ezee.main:id/textViewBuy")
    private MobileElement btnBuyPulsa;

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

    @AndroidFindBy(id = "com.ezee.main:id/textViewTotal")
    private MobileElement totalPayment;

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
    private MobileElement btnAddPromoCode;

    @AndroidFindBy(id = "com.ezee.main:id/smoothProgressBar")
    private MobileElement progressBar;

    public void twoSecond(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void waitHomePage(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/slider")));
    }

    public void clickPulsa() {
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.press(PointOption.point(100,1314))
//                .release()
//                .perform();
        iconPulsa.click();
    }
    public void waitTxtNumber(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/editTextPhone")));
        twoSecond();
    }
    public void waitPulsaDetail(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewPhoneNumber")));
        twoSecond();
    }
    //com.ezee.main:id/textViewPhoneNumber
    public void setTxtNumber(String number){
        txtNumber.sendKeys(number);
    }
    public void clickEnter(){
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public void hideKeyboard(){
        driver.hideKeyboard();
    }
    public void waitEzeegiftCard(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ezee.main:id/imageViewBackground")));
    }
    public void clickSubmit(){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(921,1437))
                .release()
                .perform();
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

    public void addPromoCode(){
        btnAddPromoCode.click();
    }

    public void getPromoCode(){
        etPromoCode.getText();
    }

    public void getPromoCodeOutside(){
        chipPromo.getText();
    }

    public void verifyPromoCode(){
        if (chipPromo.getText().contains("PPP30")){
            System.out.println("Promo Code Sesuai");
        }else{
            System.out.println("Promo Code Tidak Sesuai");
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
        if (totalPayment.isDisplayed()){
            System.out.println("Total Payment Tampil");
        }else{
            System.out.println("Total Payment Tidak Tampil");
        }
    }

    public void waitUsePromo(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewPromoCode")));
    }

    public void waitPaymentCode(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewPaymentCode")));
    }

    public void waitProgress(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.ezee.main:id/smoothProgressBar")));
    }

    public void clickEzeegift(){
        ezeegiftBtn.click();
    }

    public void verifyAmount(){
        if (totalBelanja.isDisplayed() && totalSaldo.isDisplayed()){
            System.out.println("Total Belanja dan Total Saldo sudah Tampil");
        }
    }

    public void chooseEzeegift(AndroidDriver<MobileElement> driver){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(533,1312))
                .release()
                .perform();
    }

    public void clickBuyEzeegift(){
        btnBuyEzeegift.click();
    }

    public void waitEzeeegiftPayment(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewDesc")));
    }

    public void waitEzeegiftLayout(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/LayoutEzeegift")));
    }

    public void waitPromoCodeBtn(AndroidDriver<MobileElement> driver){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewAddPromoCode")));
    }

    public void waitTxtviewError(){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ezee.main:id/textViewError")));
    }

    public void verifyPaymentEzeegift(){
        if (totalPayment.isDisplayed()){
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
        //Anda telah mencoba lebih dari 10x. Mohon menunggu 1 jam untuk mencoba kembali
        if (txtViewError.getText().contains("Promo tidak tersedia")){
            System.out.println("Validasi Code Promo ");
        }else{
            System.out.println("Validasi Code Promo ");
        }
    }

    public void VerifyWithSamePromoCode(){
        if (txtViewError.getText().contains("Promo ini tidak bisa digabung dengan promo yang sudah Anda pilih")){
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
        addPromoCode();
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
        waitPaymentCode(driver);
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
        addPromoCode();
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