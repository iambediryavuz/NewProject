package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethod_ImplicitlyWait {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//techproed sayfasina gidelim
        String amazonUrl= "https://amazon.com";
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);
//amazona gidelim
        driver.get(amazonUrl);
//techpro sayfasina geri donelim
driver.navigate().back();
//sayfa basligini Techpro icerdigini test edelim
        String actualTitle=driver.getTitle();
        String arananKelime = "Techpro";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED"+ actualTitle);

//tekrar amazon sayfasina gidelim
        driver.navigate().forward();
//sayfa basligini Amazon icerdigini test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Sayfayi kapatiniz
        driver.close();

    }
}
