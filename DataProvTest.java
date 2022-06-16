package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProvTest {
    WebDriver driver;
    public String searchUrl;

    @DataProvider(name = "dp")
    public Object[][] parseData() {
        return new Object[][] {
                {"https://yahoo.com"},
        {"https://duckduckgo.com"}
        };
    }

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/volodymyr/IdeaProjects/untitled/sources/chromedriver 3");
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "dp")
    private void test(String searchUrl) throws InterruptedException {
        driver.get(searchUrl);
        WebElement element = driver.findElement(By.xpath(".//*[@name='q']"));
        element.sendKeys("git merge vs rebase");
        element.submit();
        Thread.sleep(3_000);
        System.out.println("Page title is: " + driver.getTitle());
        Thread.sleep(3_000);
    }

        @AfterTest
                public void tearDown() {
            driver.quit();
        }
    }

