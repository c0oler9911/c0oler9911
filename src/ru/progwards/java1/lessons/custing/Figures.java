package ru.progwards.java1.lessons.custing;

import static java.lang.Math.sqrt;

public class Figures {
    static final double π=3.14;
    public static double circle(double r){
        return r*r*π;
    }
    public static double square(double n){
        return n*n;
    }
    public static Double triangle(double k){
        return sqrt(3*k/2*(3*k/2-k)*(3*k/2-k)*(3*k/2-k));
    }
    public static double squareVsTraiange(double p) {
        return square(p)/triangle(p);
    }
        public static double squareVsCircle(double p){
        return square(p)/circle(p);
        }
    public static double triangleVsCircle(double p){
        return triangle(p)/circle(p);
    }

    public static void main(String[] args) {
        System.out.println(squareVsCircle(4.97982125463533));
    }
}
