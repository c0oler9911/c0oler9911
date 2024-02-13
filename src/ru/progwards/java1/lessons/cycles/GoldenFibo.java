package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
    public static int fiboNumber(int n) {
        if (n < 1)
            return 0;
        if (n < 2)
            return 1;
        return fiboNumber(n - 1) + fiboNumber(n - 2);
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        final double v = 1.61703;
        final double q = 1.61903;
        double d = Math.sqrt(Math.pow(a, 2) - (Math.pow((Double.valueOf(c) / 2), 2)));
        double e = Math.sqrt(Math.pow(a, 2) - (Math.pow((Double.valueOf(b) / 2), 2)));
        double f = Math.sqrt(Math.pow(b, 2) - (Math.pow((Double.valueOf(a) / 2), 2)));
        System.out.println("d=" + d);

        if ((a == b) && (v < d) && (d > q) || ((a == c) && (v < e) && (e > d)) || ((b == c) && (v < f) && (f > q)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(7));
        System.out.println(isGoldenTriangle(5, 5, 5));
        int i;
        for (i = 1; i < 15; i++) {
            System.out.println(fiboNumber(i));
        }
        int a;
        int b;
        int c;
        for (a = b = fiboNumber(i), c = fiboNumber(i); i < 10; i++) {
            if (isGoldenTriangle(a, b, c) == true)
                System.out.println("a="+a +" , b="+b+" , c="+c);
        }
    }
}


