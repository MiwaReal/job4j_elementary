package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70; /* формула перевода рублей в евро. */
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public  static float euroToRubles(float value) {
        float rsl = value * 70; /* формула перевода евро в рубли. */
        return rsl;
    }

    public  static float dollarToRubles(float value) {
        float rsl = value * 60; /* формула перевода долларов в рубли. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float rubEuro = Converter.euroToRubles(5);
        float rubDollar = Converter.dollarToRubles(5);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("5 euro are " + rubEuro + " rubles.");
        System.out.println("5 dollars are " + rubDollar + " rubles.");
    }
}
