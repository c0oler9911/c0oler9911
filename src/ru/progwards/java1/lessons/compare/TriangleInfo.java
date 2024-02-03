package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        if (a>=c+b|c>=b+a|b>=c+a)
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
        System.out.println(isTriangle(5,4,1));



    }
}
