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
        if (a == b && (v >= Double.valueOf(a/c)) && (q <= Double.valueOf(a/c)))
            return true;
        if (a == c && (v >= Double.valueOf(a/b)) && (q <= Double.valueOf(a/b)))
           return true;
        if (b == c && (v >= Double.valueOf(b/a)) && (q <= Double.valueOf(b/a)))
        return true;
return false;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(7));
        System.out.println(isGoldenTriangle(34, 34, 55));
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


