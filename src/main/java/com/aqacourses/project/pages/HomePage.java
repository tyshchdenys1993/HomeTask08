package com.aqacourses.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends AbstractPage {

    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Constructor
     *
     * @param driver
     */
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
}
