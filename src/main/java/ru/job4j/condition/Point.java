package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int resx = x2 - x1;
        int resy = y2 - y1;
        double rsl = Math.sqrt(Math.pow(resx, 2) + Math.pow(resy, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 1, 1, 1);
        double result2 = Point.distance(-2, -2, -2, -5);
        System.out.println("result (0, 0) to (2, 0) " + " = " + result);
        System.out.println("result (0, 0) to (2, 0) " + " = " + result1);
        System.out.println("result (0, 0) to (2, 0) " + " = " + result2);
    }
}