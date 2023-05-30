import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Test1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ekrem\\OneDrive\\Masaüstü\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        ;
driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ekrem");
driver.findElement(By.xpath("//*[@placeholder='name@example.com']")).sendKeys("ekremkilicer@bdh.com.tr");
driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Siyavuspasa Mah....");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");
driver.findElement(By.xpath("//*[text()='Submit']")).click();
    }
}
