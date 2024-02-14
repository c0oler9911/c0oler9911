package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit) {
        int dig;
        while (number >= 0) {
            if (number % 10 == digit)
                return true;
            number = number / 10;
            if (number%10 == 0)
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(105, 5));
    }

}
