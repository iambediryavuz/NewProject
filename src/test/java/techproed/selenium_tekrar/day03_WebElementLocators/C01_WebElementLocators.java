package techproed.selenium_tekrar.day03_WebElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://youtube.com");
        driver.findElement(By.id("search")).sendKeys("bedir", Keys.ENTER);
        //Submit yapmak yerine sendKey
        //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //Birden fazla kullanilacaksa bir webelemente atama yapilir
        //searchBox.sendKeys("iphone");//Locate ettigimiz searchBox'a iphone metnini gonderir





    }
}
