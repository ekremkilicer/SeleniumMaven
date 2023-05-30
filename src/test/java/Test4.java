import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //browseri büyütmek için

        driver.get("https://demoqa.com/alerts");

        WebElement alertButonu1 = driver.findElement(By.xpath("//*[@id='alertButton']"));
        alertButonu1.click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(1000);
        WebElement alertButonu2 = driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
        alertButonu2.click();

        Thread.sleep(6000);
        alert.accept();


        Thread.sleep(1000);
        WebElement alertButonu3 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
        alertButonu3.click();

        alert.dismiss();

        driver.findElement(By.xpath("//*[@class='text-success' and contains(text(),'You selected')]"));

        Thread.sleep(1000);
        WebElement alertButonu4 = driver.findElement(By.xpath("//*[@id='promtButton']"));
        alertButonu4.click();

        String alertText = alert.getText();
        System.out.println(alertText);

        Thread.sleep(1000);
        alert.sendKeys("mert");
        alert.accept();

        if (alertText.equals("Please enter your name")){
            System.out.println("alert yazısı doğru");
        }else System.out.println("alert yazısı yanlış");

    }
}
