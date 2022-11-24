import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Sol {
    WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sezer\\IdeaProjects\\SeleniumTest\\dri\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/slider");



        WebElement silder=driver.findElement(By.cssSelector("input[type='range']"));

        Actions slider=new Actions(driver);

        slider.dragAndDropBy(silder,30,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,0,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,10,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,20,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,35,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,45,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,-200,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,200,0).build().perform();
        Thread.sleep(100);
        slider.dragAndDropBy(silder,35,0).build().perform();

        WebElement value=driver.findElement((By.cssSelector(".range-slider__tooltip__label")));
        String val=value.getText();
        System.out.println("Value: "+ val);


        WebElement sliderPac=driver.findElement(By.id("sliderValue"));
        String sliText=sliderPac.getAttribute("value");
        System.out.println("Slide: "+sliText);

    }
}

