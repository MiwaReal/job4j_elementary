package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        String day = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMondayThen1Rus() {
        String day = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayThen2() {
        String day = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayThen2Rus() {
        String day = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayThen3() {
        String day = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayThen3Rus() {
        String day = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayThen4() {
        String day = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayThen4Rus() {
        String day = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayThen5() {
        String day = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayThen5Rus() {
        String day = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayThen6() {
        String day = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayThen6Rus() {
        String day = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayThen7() {
        String day = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayThen7Rus() {
        String day = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayThenErr() {
        String day = "Suunday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayThenErrRus() {
        String day = "Ввоскресенье";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberThenErr() {
        String day = "-1";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}