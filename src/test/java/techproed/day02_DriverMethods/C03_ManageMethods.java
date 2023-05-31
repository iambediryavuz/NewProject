package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        Thread.sleep(3000);

        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari = " + driver.manage().window().getSize());
        Thread.sleep(3000);
        //Browser'i maximize yapalim
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        Thread.sleep(3000);
        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());
        Thread.sleep(3000);
        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari = " + driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Sayfayi fullScreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(3000);
        //sayfayi kapatiniz
        driver.close();








    }
}
