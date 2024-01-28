package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {

    public static Integer sumDigits(Integer number) {
        int a = number % 100 % 10;
        int b = number % 100/10;
        int c = number / 100;
        int d = a + b + c;
        return d;
    }

    public static Integer mulDigits(Integer number) {
        int a = number % 100 % 10;
        int b = number % 100/10;
        int c = number / 100;
        int d = a * b * c;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(mulDigits(123));
        System.out.println(sumDigits(123));
    }
}