package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        if (array.length == 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        } else if (array.length % 2 > 0) {
            for (int first = 0; first < array.length / 2 - 1; first++) {
                for (int second = array.length - 1; second > array.length / 2 + 1; second--) {
                    int temp = array[first];
                    array[first] = array[second];
                    array[second] = temp;
                }
            }
        } else if (array.length % 2 == 0) {
            for (int first = 0; first < array.length / 2; first++) {
                for (int second = array.length - 1; second - first >= array.length / 2; second--) {
                    int temp = array[first];
                    array[first] = array[second];
                    array[second] = temp;
                }
            }
        }
        return array;
    }
}