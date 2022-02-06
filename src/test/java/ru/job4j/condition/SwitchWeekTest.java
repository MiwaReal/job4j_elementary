package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenNameOfDay1ThenMon() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDay2ThenTue() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDay3ThenWed() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDay4ThenThur() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDay5ThenFri() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDay6ThenSat() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDay7ThenSun() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDayWrongThenError() {
        int day = 100;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDayWrongThenError1() {
        int day = 0;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNameOfDayWrongThenError2() {
        int day = -5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}