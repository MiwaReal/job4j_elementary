package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;   //вес мужчины
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;  //вес женщины
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 190; // рост мужчины
        short womanHeight = 180; // рост женщины
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 190 is " + man);
        System.out.println("Woman 180 is " + woman);
    }

}