package techproed.selenium_tekrar.day02_DriverMethodsTekrar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tekrar_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari = " + driver.manage().window().getSize());
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");
        System.out.println("Techproed sayfasinin konumu = " + driver.manage().window().getPosition());
        System.out.println("Techpro sayfasinin boyutlari = " + driver.manage().window().getSize());
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600));
        //Sayfayi kapat
        driver.close();


    }
}
