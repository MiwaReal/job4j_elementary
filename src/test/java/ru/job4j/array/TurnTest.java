package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWith2Elements() {
        int[] input = new int[] {0, 1};
        int[] result = Turn.back(input);
        int[] expected = new int[] {1, 0};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWith10Elements() {
        int[] input = new int[] {4, 1, 6, 2, 5, -100, 333, 7, 8, 9};
        int[] result = Turn.back(input);
        int[] expected = new int[] {9, 8, 7, 333, -100, 5, 2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }
}