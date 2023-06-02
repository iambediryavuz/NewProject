package techproed.selenium_tekrar.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_odev {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
        WebElement reklamKapat = driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']"));
        reklamKapat.click();

//Bir mail adersi giriniz
        WebElement emailGir = driver.findElement(By.xpath("//input[@id='email']"));
        emailGir.sendKeys("deli@dolu.com");

//Bir password giriniz
        WebElement sifreGir = driver.findElement(By.xpath("//input[@class='form-control password']"));
        sifreGir.sendKeys("123Asd.,.");

//Login butonuna tiklayiniz
        WebElement sifreTikla = driver.findElement(By.xpath("//button[@value='Log In']"));
        sifreTikla.click();
//"There was a problem with your login." texti gorunur ise
//"kayit yapilamadi" yazdiriniz
//eger yazi gorunur degilse "kayit yapildi" yazdiriniz
//sayfayı kapatiniz
    }
}
