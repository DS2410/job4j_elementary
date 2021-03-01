package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x1 - x2;
        double b = y1 + y2;
        double c = Math.pow(a, 2);
        double d = Math.pow(b, 2);
        double i = c +d;
        double f = Math.sqrt(i);
        double rsl = i;
        return i;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0,0,2,0);
        double result2 = Point.distance(2,2,2,2);
        double result3 = Point.distance(2,2,2,4);
        System.out.println("result1(0, 0) to (2, 0)" + result1);
        System.out.println("result2(2, 2) to (2, 2)" + result2);
        System.out.println("result3(2, 2) to (2, 4)" + result3);
    }


}
