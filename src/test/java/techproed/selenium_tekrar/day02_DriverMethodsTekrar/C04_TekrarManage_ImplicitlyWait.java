package techproed.selenium_tekrar.day02_DriverMethodsTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_TekrarManage_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //techpro sayfasina gidelim
        driver.get("https:techproeducation.com/");

        //amazon'a gidelim
        driver.get("https://amazon.com/");

        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basliginin techpro icerdigini test edelim
        String expectedTitle = "Techpro";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED "+actualTitle);
        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        //sayfa basliginin Amazon icerdigini test edelim
        String expectedAmazon = "Amazon";
        String actualAmazon= driver.getTitle();
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Sayfayi kapatiniz
        driver.close();










    }
}
