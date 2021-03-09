package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        /* int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");*/
        int indollar = 120;
        int ineuro = 140;
        int expecteddollar = 2;
        int expectedeuro = 2;
        int outdollar = Converter.rubleToDollar(indollar);
        int outeuro = Converter.rubleToEuro(ineuro);
        boolean passeddollar = expecteddollar == outdollar;
        boolean passedeuro = expectedeuro == outeuro;
        System.out.println("140 rubles are 2. Test result : " + passedeuro);
        System.out.println("120 rubles are 2. Test result : " + passeddollar);
    }
}
