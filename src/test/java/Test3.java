import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ekrem\\OneDrive\\Masaüstü\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            //driver.manage().window().maximize(); /* full ekran olarak açmak için, butonu ekranda görmediğinde tıklayamıyor. */

    //1- CheckBox Kontrol Senaryosu Demoqa CheckBox sayfası açılır. Sayfanın açıldığı görülür.
        driver.get("https://demoqa.com/checkbox");


    //2-Home dizini genişletilir. Home dizininin genişletildiği görülür.
        WebElement genisletmeButonu = driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
        genisletmeButonu.click();
    //3-    Documents dizini genişletilir. Documents dizininin genişletildiği görülür.
        WebElement documentsButton= driver.findElement(By.xpath("//*[text()='Documents']/parent::label/parent::span/child::button"));
        documentsButton.click();

    //4- Açılan Documents sekmesinin içindeki Office checkbox'ı işaretlenir. Office checkbox'ının işaretlendiği görülür(kontrol edilir).
        WebElement officeCheckbox= driver.findElement(By.xpath("//*[text()='Office']"));
        officeCheckbox.click();

    //5- You have selected alanı seçilen dosyanın adları kontrol edilir. You have selected alanında seçilmiş olan checkboxın adı görülür
        WebElement officeControl= driver.findElement(By.xpath("//*[text()='office']"));
        String yazi =officeControl.getText();
        if (yazi.contains("office")){
            System.out.println("Test Başarılı!");
        }else{
            System.out.println("Test Başarısız!");
        }
    driver.close();


    }
}
