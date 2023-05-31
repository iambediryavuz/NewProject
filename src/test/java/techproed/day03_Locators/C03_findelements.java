package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Pupil\\Desktop\\Selenium\\B151Selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi = " + linklerListesi.size());
        /*
        for (WebElement w : linklerListesi) {
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }
        }

         */
        //Lambda ile yazdiralim
        linklerListesi.forEach(link -> {if (link.getText().isEmpty())
        {System.out.println(link.getText());}});

        //Shop deals in Electronics webElementinin yazisini yazdiralim
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());
        driver.close();


    }
}
