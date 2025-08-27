package com.randomcalendar.tests;

import com.randomcalendar.base.BaseTest;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CalendarGetDatesTest extends BaseTest {

    @Test
    public void validateAddDatesGetDates()  {
        String actualH2Text = calendarDatesPage.getTitleHeader();
        assertEquals(actualH2Text, "Random Calendar Date Generator", "H2 text mismatch!!!");
        calendarDatesPage.setDatesQuantity("4");
        calendarDatesPage.selectStartDayDropdown("5");
        calendarDatesPage.selectStartMonthDropdown("January");
        calendarDatesPage.selectStartYearDropdown("2025");
        calendarDatesPage.selectEndDayDropdown("25");
        calendarDatesPage.selectEndMonthDropdown("November");
        calendarDatesPage.selectEndYearDropdown("2025");
        calendarDatesPage.clickGetDatesButton();

    }

    @Test
    public void validateFourDates()  {
        validateAddDatesGetDates();
        String actualText = dateGeneratorPage.getResultsHeader();
        assertEquals(actualText, "Here are your 4 calendar dates:", "Header text mismatch!!!");

    }

    @Test
    public void validateFourDatesV2()  {
        validateAddDatesGetDates();
        List<String> dates = dateGeneratorPage.getGeneratedDates();
        assertEquals(dates.size(), 4, "Unexpected number of dates!!!");
        for (String date : dates) {
            assertTrue(date.matches("\\d{4}-\\d{2}-\\d{2}"), "Invalid date format!: " + date);
        }
    }

    @Test
    public void validateGeneratedDatesWithinRange() {
        validateAddDatesGetDates();
        List<String> dates = dateGeneratorPage.getGeneratedDates();
        LocalDate startDate = LocalDate.of(2024, 1, 5);
        LocalDate endDate = LocalDate.of(2025, 11, 25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (String date : dates) {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            assertTrue(
                    (parsedDate.isEqual(startDate) || parsedDate.isAfter(startDate)) &&
                            (parsedDate.isEqual(endDate) || parsedDate.isBefore(endDate)),
                    "Date out of allowed range: " + date
            );
        }
    }
}
