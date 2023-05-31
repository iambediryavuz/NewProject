package techproed.selenium_tekrar.day02_DriverMethodsTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Techproeducation sayfasina gidelim
        //Sonra Amazon sayfasina gidelim
        //Amazon sayfasi basligini yazdiralim
        //Techproeducation sayfasina geri donelim
        //Sayfa basligini yazdiralim
        //Amazon sayfasina tekrar gidip url'i yazdiralim
        //Amazon sayfasindayken sayfayi yenileyelim
        driver.get("https://techproeducation.com");
        Thread.sleep(3000);
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        System.out.println("Amazon Sayfa basligi = " + driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        System.out.println("Techproeducation sayfa basligi = " + driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("Amazon Sayfasi Url'i = " + driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().refresh();


    }
}
