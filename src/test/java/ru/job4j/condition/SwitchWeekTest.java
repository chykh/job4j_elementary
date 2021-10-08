package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void nameTuesdayOfDay2() {
        int day = 2;
        String expected = "Вторник";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameErrorOfDayMinus6() {
        int day = -6;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameSundayOfDay7() {
        int day = 7;
        String expected = "Воскресенье";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }

}