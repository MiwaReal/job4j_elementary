package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        if (left == right) {
            result = left;
        }
        return result;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 555;
        max(left, right);
    }

}
