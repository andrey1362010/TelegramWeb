package ru.andruhn;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Xiaomi\\IdeaProjects\\TelegramWeb\\chrome\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--user-data-dir=profile3");

        WebDriver driver = new ChromeDriver(options);
        System.out.println("created");
        driver.get("https://2ip.ru/");
        //driver.get("http://www.html-kit.com/tools/cookietester/");
        System.out.println("wait");
        new WebDriverWait(driver, 100).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        System.out.println("done");

        String text =
                driver.findElement(By.id("d_clip_button"))
                .findElement(By.tagName("span"))
                .getText();
        System.out.println(text);

        driver.close();
    }

    //toto прокси
    //todo headless
    //todo экшены
}
