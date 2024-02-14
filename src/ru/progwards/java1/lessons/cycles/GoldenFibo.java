package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
    static final double v = 1.61703;
    static final double q = 1.61903;

    public static int fiboNumber(int n) {
        if (n < 1)
            return 0;
        if (n < 2)
            return 1;
        return fiboNumber(n - 1) + fiboNumber(n - 2);
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        if (a == b && (((double) a / c >= v) && ((double) a / c <= q)))
            return true;
        if ((a == c) && (((double) a / b >= v) && ((double) a / b <= q)))
            return true;
        if ((b == c) && (((double) b / a >= v) && ((double) b / a <= q)))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(7));
        System.out.println(isGoldenTriangle(55, 55, 34));
        int i;
        for (i = 1; i < 15; i++) {
            System.out.println(fiboNumber(i));
        }
        int a;
        int b;
        int c;
        for (i = 2; i < 15; i++) {
            if (fiboNumber(i)<=100 && isGoldenTriangle(fiboNumber(i), fiboNumber(i), fiboNumber(i-1))==true)
                System.out.println("a = b = "+fiboNumber(i)+ ", c = "+fiboNumber(i-1));
        }
    }
}


