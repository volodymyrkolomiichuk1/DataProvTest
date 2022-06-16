//package lesson5;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.*;
//
//public class Facebook {
//    WebDriver driver;
//
//    @BeforeTest
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "/Users/volodymyr/IdeaProjects/untitled/sources/chromedriver 3");
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void getRegButton() throws InterruptedException {
//        driver.get("https://facebook.com");
//        WebElement createAcc = driver.findElement(By.xpath(".//*[@data-testid=\"open-registration-form-button\"]"));
//        createAcc.submit();
//        Thread.sleep(3_000);
//    }
//
//    @Test(dependsOnMethods = {"getRegButton"})
//    public void fillRegField() throws InterruptedException {
//        WebElement element = driver.findElement(By.xpath(".//*[@name=\"firstname\"]"));
//        element.sendKeys("Volodymyr");
//        Thread.sleep(3_000);
//        WebElement enterFirstName = driver.findElement(By.xpath(".//*[@name=\"firstname\"]"));
//
//        enterFirstName.sendKeys("Volodymyr");
//        Thread.sleep(1_000);
//
//        WebElement enterLastName = driver.findElement(By.xpath(".//*[@name=\"lastname\"]"));
//        enterLastName.sendKeys("Kolomiichuk");
//        Thread.sleep(1_000);
//
//        WebElement enterEmail = driver.findElement(By.xpath(".//*[@name=\"reg_email__\"]"));
//        enterEmail.sendKeys("testmail@mail.mail123");
//        Thread.sleep(1_000);
//
//        WebElement enterEmailConfirm = driver.findElement(By.xpath(".//*[@name=\"reg_email_confirmation__\"]"));
//        enterEmailConfirm.sendKeys("testmail@mail.mail123");
//        Thread.sleep(2_000);
//
//        WebElement enterPassword = driver.findElement(By.xpath(".//*[@name=\"reg_passwd__\"]"));
//        enterPassword.sendKeys("p@ssw0rd");
//        Thread.sleep(1_000);
//
//        Select drpMonth = new Select(driver.findElement(By.xpath(".//*[@name=\"birthday_month\"]")));
//        drpMonth.selectByVisibleText("Feb");
//        //       Thread.sleep(1_000);
//
//        Select drpDay = new Select(driver.findElement(By.xpath(".//*[@name=\"birthday_day\"]")));
//        drpDay.selectByVisibleText("11");
//        //       Thread.sleep(1_000);
//
//        Select drpYear = new Select(driver.findElement(By.xpath(".//*[@name=\"birthday_year\"]")));
//        drpYear.selectByVisibleText("2000");
//        //       Thread.sleep(1_000);
//
//        WebElement enterGender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
//        enterGender.click();
//        Thread.sleep(1_000);
//    }
//
//    @Test(dependsOnMethods = {"fillRegField"})
//    private void checkFields() throws InterruptedException {
//        String attributeName = enterFirstName.getAttribute("Volodymyr");
//            System.out.println("Entered: "+attributeName);
//            String attributeLastName = enterFirstName.getAttribute("Kolomiichuk");
//            System.out.println("Entered: "+attributeLastName);
//
//    }
//
//    @Test
//            public void checkSubmit() throws InterruptedException {
//        if( driver.findElement(By.xpath(".//*[@name=\"websubmit\"]")).isDisplayed()){
//            System.out.println("Element is Visible");
//        }
//        else{
//            System.out.println("Element is InVisible");
//        }
//    }
//
//
//    @AfterTest
//    public void tearDown() {
//        driver.quit();
//    }
//}
//
