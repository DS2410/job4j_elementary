package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int rsl = max(first, max(second, third));
        return rsl;

    }

    public static int max(int first, int second, int third, int four) {
        int rsl = max(max(first, second), max(third, four));
        return rsl;
    }

}
