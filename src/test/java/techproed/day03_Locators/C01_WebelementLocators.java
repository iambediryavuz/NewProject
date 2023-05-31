package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //Arama kutusuna locate edelim //Arama kutusuna iphone yazdiralim ve aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //sayfayi kapatalim
        driver.close();







    }
}
