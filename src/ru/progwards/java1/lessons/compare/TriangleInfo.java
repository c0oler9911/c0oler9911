package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        if (a>c+b|c>b+a|b>c+a)
            return false;
        else
            return true;
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c | Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)) == a | Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2)) == b)
            return true;
        else
            return false;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        if (a==b | b==c | c==a)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isTriangle(2, 2, 3));
        System.out.println(isTriangle(2, 3, 4));
        System.out.println(isTriangle(3, 2, 5));
        System.out.println(isTriangle(2, 3, 6));
        System.out.println(isTriangle(3, 3, 9));
        System.out.println(isIsoscelesTriangle(2, 2, 3));
        System.out.println(isIsoscelesTriangle(2, 3, 2));
        System.out.println(isIsoscelesTriangle(3, 2, 2));
        System.out.println(isIsoscelesTriangle(2, 2, 2));
        System.out.println(isIsoscelesTriangle(3, 3, 3));


    }
}