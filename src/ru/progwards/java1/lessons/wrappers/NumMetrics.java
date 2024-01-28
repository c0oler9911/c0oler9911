package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    static int a;
    static int b;
    static int c;
public static Integer Digits(Integer number) {
int a = number % 100 % 10;
b = number % 100/10;
c = number / 100;
return number;
}
    public static Integer sumDigits(Integer number) {
        Digits(number);
        int d = a + b + c;
        return d;
    }

    public static Integer mulDigits(Integer number) {
        Digits(number);
        int d = a * b * c;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(mulDigits(234));
        System.out.println(sumDigits(192));
    }
}