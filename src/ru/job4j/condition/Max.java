package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int meaning = Max.max(7,5);
        System.out.println(meaning);

    }
}
