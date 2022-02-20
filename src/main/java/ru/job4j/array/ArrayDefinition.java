package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива типа short равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива типа string равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива типа float равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Ivan";
        System.out.println("Имя первого человека: " + names[0]);
        names[1] = "Alina";
        System.out.println("Имя второго человека: " + names[1]);
        names[2] = "Petr";
        System.out.println("Имя третьего человека: " + names[2]);
        names[3] = "John";
        System.out.println("Имя четвертого человека: " + names[3]);
    }
}
