package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива типа short равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива типа string равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива типа float равен: " + prices.length);
    }
}
