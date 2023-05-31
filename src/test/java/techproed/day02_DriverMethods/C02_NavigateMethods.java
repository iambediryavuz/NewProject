package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//Techproeducation sayfasın gidelim
driver.navigate().to("https://techproeducation.com");//get() methodu ile ayni mantikla calisir
        Thread.sleep(3000);//java kodlarini beklemetmek icin Thread.sleep kullanabiliriz
//Sonra Amazon sayfasına  gidelim
        driver.navigate().to("https:amazon.com");
        Thread.sleep(3000);
//Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfa basligi : "+driver.getTitle());
        Thread.sleep(3000);
//Tecproeducation sayfasıa geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);
//Sayfa başlığını yazdıralım
        System.out.println("Techproeducation sayfa basligi : "+driver.getTitle());
        Thread.sleep(3000);
//Amazon sayfasıan tekrar gidip URL'i yazdıralım
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("Amazon sayfasi Url : "+driver.getCurrentUrl());
        Thread.sleep(3000);
//Amazon sayfasındayken sayfayı yenileyelim.
        driver.navigate().refresh();





    }
}
