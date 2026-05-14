package com.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();

    public final static int TIMEOUT = 10;

    public static HelperClass helperclass;

    public HelperClass() {

        WebDriver driver1 = new ChromeDriver();

        driver.set(driver1);

        wait.set(new WebDriverWait(driver1,
                Duration.ofSeconds(TIMEOUT)));

        driver1.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(TIMEOUT));

        driver1.manage().window().maximize();
    }

    public static void setDriver() {

        if (helperclass == null) {

            helperclass = new HelperClass();
        }
    }

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void openPage(String url) {

        getDriver().get(url);
    }

    public static void teardown() {

        if (getDriver() != null) {

            getDriver().quit();

            driver.remove();
            wait.remove();
        }

        helperclass = null;
    }
}