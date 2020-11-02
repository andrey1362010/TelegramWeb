package ru.andruhn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class TestSeleniumFirefox {

    public static void main(String[] args) throws IOException, InterruptedException {
        //String firefox_exe = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
        //Runtime.getRuntime()
        //        .exec(new String[]{firefox_exe, "-CreateProfile", "\"p15 C:\\Users\\Xiaomi\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\p15\""})
        //        .waitFor();


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Xiaomi\\IdeaProjects\\TelegramWeb\\firefox/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\Xiaomi\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\p15"));
        //ProfilesIni listProfiles = new ProfilesIni();
        //FirefoxProfile profile = listProfiles.getProfile("p15");
        //profile.setPreference("webdriver.load.strategy", "unstable");
        //profile.setAssumeUntrustedCertificateIssuer(false);
        //profile.setPreference("browser.download.dir", "C:\\download");
        //profile.setPreference("browser.download.folderList", 2);//profile.setPreference("webdriver.firefox.profile", "p15");
        //System.out.println(profile);
        //options.setProfile(profile);
        options.addArguments("-P", "p15");
        options.addArguments("-new-instance");
        //options.addPreference("webdriver.firefox.profile", "p15");
        //options.addPreference("-P", "C:\\Users\\Xiaomi\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\p15")

//        FirefoxProfile firefoxProfile = new FirefoxProfile();
//        firefoxProfile.setPreference("browser.download.folderList",2); //dont take default download folder
//        firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);//dont show download box
//        firefoxProfile.setPreference("browser.download.dir","c:\\downloads");//provide download location
//        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv"); //dont ask save as for provided types
//        options.setProfile(firefoxProfile);

        ;
        //options.addArguments("--headless");
        //options.addArguments("--disable-gpu");
        //options.addArguments("--user-data-dir=profile3");

        WebDriver driver = new FirefoxDriver(options);
        System.out.println("created");
        driver.get("https://2ip.ru/");
        System.out.println("wait");

        new WebDriverWait(driver, 100).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        System.out.println("done");
        String text =
                driver.findElement(By.id("d_clip_button"))
                        .findElement(By.tagName("span"))
                        .getText();
        System.out.println(text);
        //driver.close();

    }

    //toto прокси
    //todo headless
    //todo экшены
}
