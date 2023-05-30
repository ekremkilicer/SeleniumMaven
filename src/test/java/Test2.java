import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ekrem\\OneDrive\\Masaüstü\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        WebElement genisletmeButonu = driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
        genisletmeButonu.click();
        WebElement desktopButton = driver.findElement(By.xpath("//span[@class='rct-title' and text()='Desktop']/parent::label/parent::span/child::button"));
        desktopButton.click();
        WebElement desktopCheckbox = driver.findElement(By.xpath("//*[text()='Desktop']/parent::label//*[@class='rct-icon rct-icon-uncheck']"));
        desktopCheckbox.click();

        driver.findElement(By.xpath("//*[text()='Desktop']/parent::label//*[@class='rct-icon rct-icon-check']"));
    }
    }

