package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int y = 5;
        System.out.println("Вызов статического метода sum: " + sum(y));
        System.out.println("Вызов нестатического метода multiply: " + calculator.multiply(y));
        System.out.println("Вызов статического метода minus: " + minus(y));
        System.out.println("Вызов нестатического метода divide: " + calculator.divide(y));
        System.out.println("Вызов нестатического метода sumAllOperation: " + calculator.sumAllOperation(y));
    }
}