package techproed.selenium_tekrar.day02_DriverMethodsTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondOdev {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.get("http://www.amazon.com/");
        //Sayfanin konumunu ve boyutlarini yazdiriniz
        System.out.println("Amazon sayfasinin konumu = " + driver.manage().window().getPosition());
        System.out.println("Amazon sayfasinin boyutlari = " + driver.manage().window().getSize());
        //Sayfayi simge durumuna getiriniz
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapiniz
        Thread.sleep(3000);
        //sayfanin konumunu ve boyutlarini maximize durumunda yazdiriniz
        driver.manage().window().maximize();
        System.out.println("Sayfanin Max durumundaki konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin max durumundaki boyutlari = " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayi fullscreen yapiniz
        driver.manage().window().fullscreen();
        //sayfanin konumunu ve boyutlarini fullscreen durumunda yazdiriniz
        System.out.println("Sayfanin fullScreen durumunda konumu  = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin fullscreen durumunda boyutlari = " + driver.manage().window().getSize());
        Thread.sleep(3000);
        //sayfayi kapatiniz
        driver.close();









    }
}
