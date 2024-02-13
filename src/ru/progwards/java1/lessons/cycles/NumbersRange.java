package ru.progwards.java1.lessons.cycles;

import ru.progwards.java1.lessons.custing.OneLine;

public class NumbersRange {
    public static long sumNumbers(int start, int finish) {
        int sum = start;
        while (start < finish) {
            start++;
            sum += start;
            System.out.println(sum);
        }
        return sum;
    }

    public static long sumOdd(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++)
            if (start % 2 == 0)
                sum += start;
        System.out.println(sum);
        return sum;
    }

    public static long sumEvenIdx(int start, int finish) {
        int sum = 0;
        int i;
        for (i = 1; start <= finish; start++, i++) {
            if (i % 2 != 0) {
                System.out.println("4isl= " + start + "   ind= " + i);
                sum = sum + start;
            }
        }


        System.out.println("sum= " + sum);
        return sum;
    }

    public static void main(String[] args) {
        sumEvenIdx(6, 17);
    }
}



