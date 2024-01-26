package ru.progwards.java1.lessons.basics;

public class Distance3D {
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        double AB = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
        return AB;
    }

    public static void main(String[] args) {
        System.out.println(distance(1,6,3,8,2,9));

    }
}