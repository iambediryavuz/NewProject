package techproed.selenium_tekrar.day02_DriverMethodsTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        //Sayfa basliginin Amazon icerdigini test edelim
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED "+actualTitle);
        }else System.out.println("Test FAILED"+actualTitle);
        //Url'in https://www.amazon.com/ oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED "+actualUrl);

        //Sayfayi kapat
        driver.close();



    }

}
