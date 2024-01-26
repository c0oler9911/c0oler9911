package ru.progwards.java1.lessons.basics;

public class Astronomy {
    static final double π = 3.14;

    public static Double sphereSquare(Double R) {
        double S = 4 * π * R * R;
        return S;
    }

    public static Double earthSquare() {
        double Se = sphereSquare(6371.2);
        return Se;
    }

    public static Double mercurySquare() {
        double Sm = sphereSquare(2439.7);
        return Sm;
    }

    public static Double jupiterSquare() {
        double Sj = sphereSquare(71492.0);
        return Sj;
    }

    public static Double earthVsMercury() {
        double EM = earthSquare() / mercurySquare();
        return EM;
    }

    public static Double earthVsJupiter() {
        double EJ = earthSquare() / jupiterSquare();
        return EJ;
    }

    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}