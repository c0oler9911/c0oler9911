package ru.progwards.java1.lessons.custing;

public class AccuracyDoubleFloat {
    public static double calculateAccuracy(){
        double d= (double) 1 /3;
        float f= (float) d;
        System.out.println(d-f);
        return (d-f);
    }

    public static void main(String[] args) {
        calculateAccuracy();
    }
}
