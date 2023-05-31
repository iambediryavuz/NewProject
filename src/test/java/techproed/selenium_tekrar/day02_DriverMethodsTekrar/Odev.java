package techproed.selenium_tekrar.day02_DriverMethodsTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1.Yeni bir Class olusturalim.C05_NavigationMethods

        //2.Youtube ana sayfasina gidelim. https://youtube.com/
        driver.navigate().to("https://youtube.com/");
        Thread.sleep(3000);
        //3.Amazon sayfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://amazon.com/");
        Thread.sleep(3000);
        //4.Tekrar YouTube sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);
        //5.Yeniden Amazon Sayfasina donelim
        driver.navigate().forward();
        Thread.sleep(3000);
        //6.Sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);
        //7.Sayfayi kapatalim/Tum sayfalari kapatalim
        driver.quit();




    }
}
