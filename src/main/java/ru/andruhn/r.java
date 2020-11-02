package ru.andruhn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class r {

    public static void main(String[] args) throws IOException {
        String firefox_exe = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
        Runtime.getRuntime().exec(new String[]{firefox_exe, "-CreateProfile", "\"profile1 C:\\Users\\Xiaomi\\IdeaProjects\\TelegramWeb\\firefox\\profile1\""});


    }

    //toto прокси
    //todo headless
    //todo экшены
}
