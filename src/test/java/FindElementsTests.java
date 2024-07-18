import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementsTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.ilcarro.web.app");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); // Ожидание локатора

    }

    @Test
    public void testFindElementsTadName(){

    }

    @AfterMethod(enabled = true) //включение или отключение закрытия браузера посте тестов
    public void tearDown() {
        driver.quit();
    }

}
