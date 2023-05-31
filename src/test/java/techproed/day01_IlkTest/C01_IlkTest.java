package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","drivers/chromedriver.exe");
        System.out.println(System.getProperty("chromeDriver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");






    }
}
