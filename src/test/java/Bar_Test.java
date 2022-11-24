import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bar_Test {
    WebDriver driver;

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sezer\\IdeaProjects\\SeleniumTest\\dri\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/progress-bar");

        WebElement startStopBut=driver.findElement(By.id("startStopButton"));
        startStopBut.click();

        WebElement progress=driver.findElement(By.cssSelector("div[role='progressbar']"));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(9));

        wait.pollingEvery(Duration.ofMillis(50));
        wait.until(ExpectedConditions.attributeToBe(progress,"aria-valuenow","61"));
        startStopBut.click();


    }
}
