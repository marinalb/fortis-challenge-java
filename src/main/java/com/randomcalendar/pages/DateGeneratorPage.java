package com.randomcalendar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class DateGeneratorPage extends BasePage {

    private final By resultsHeader = By.xpath("//p[contains(text(),'calendar dates')]");
    private final By generatedDatesBlock = By.cssSelector("p[style*='margin-left']");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

    public String getResultsHeader() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultsHeader));
        return find(resultsHeader).getText();

    }

    public List<String> getGeneratedDates() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(generatedDatesBlock));
        String allDatesText = find(generatedDatesBlock).getText();
        return Arrays.asList(allDatesText.split("\\r?\\n"));
    }

}
