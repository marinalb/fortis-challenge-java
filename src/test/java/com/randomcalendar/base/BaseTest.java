package com.randomcalendar.base;

import com.randomcalendar.pages.BasePage;
import com.randomcalendar.pages.CalendarDatesPage;
import com.randomcalendar.pages.DateGeneratorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected CalendarDatesPage calendarDatesPage;
    protected DateGeneratorPage dateGeneratorPage;
    private String URL = "https://www.random.org/calendar-dates/";


    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        Thread.sleep(600);
        calendarDatesPage = new CalendarDatesPage();
        dateGeneratorPage = new DateGeneratorPage();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
