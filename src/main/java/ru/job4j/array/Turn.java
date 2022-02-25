package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
            int i = 0;
            while (i <= (array.length - 1) / 2) {
                int first = i;
                int second = array.length - 1 - i;
                int temp = array[first];
                array[first] = array[second];
                array[second] = temp;
                i++;
            }
        return array;
        }
    }