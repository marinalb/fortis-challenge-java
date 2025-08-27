package com.randomcalendar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CalendarDatesPage extends BasePage {

    private final By titleHeader = By.cssSelector("h2");
    private final By submitButton = By.cssSelector("input[type='submit'][value='Get Dates']");
    private final By datesQuantityInput = By.cssSelector("input[type='text'][name='num']");
    private final By startDayDropdown = By.cssSelector("select[name='start_day']");
    private final By startMonthDropdown = By.cssSelector("select[name='start_month']");
    private final By startYearDropdown = By.cssSelector("select[name='start_year']");
    private final By endDayDropdown   = By.cssSelector("select[name='end_day']");
    private final By endMonthDropdown = By.cssSelector("select[name='end_month']");
    private final By endYearDropdown  = By.cssSelector("select[name='end_year']");

    public String getTitleHeader() {
        return find(titleHeader).getText();
    }

    public void setDatesQuantity(String quantityInput) {
        set(datesQuantityInput, quantityInput);
    }

    public void selectStartDayDropdown(String day) {
        Select select = new Select(find(startDayDropdown));
        select.selectByVisibleText(day);
    }

    public void selectStartMonthDropdown(String month) {
        Select select = new Select(find(startMonthDropdown));
        select.selectByVisibleText(month);
    }

    public void selectStartYearDropdown(String year) {
        Select select = new Select(find(startYearDropdown));
        select.selectByVisibleText(year);
    }

    public void selectEndDayDropdown(String day) {
        Select select = new Select(find(endDayDropdown));
        select.selectByVisibleText(day);
    }

    public void selectEndMonthDropdown(String month) {
        Select select = new Select(find(endMonthDropdown));
        select.selectByVisibleText(month);
    }

    public void selectEndYearDropdown(String year) {
        Select select = new Select(find(endYearDropdown));
        select.selectByVisibleText(year);
    }


    public DateGeneratorPage clickGetDatesButton()  {
        click(submitButton);
        return new DateGeneratorPage();
    }

}
