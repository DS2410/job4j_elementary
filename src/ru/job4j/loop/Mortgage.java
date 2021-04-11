package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double debt = amount + amount * (percent / 100);
        while (debt > 0) {
            debt = debt - salary;
            year += 1;
        }
        return year;
    }

}

