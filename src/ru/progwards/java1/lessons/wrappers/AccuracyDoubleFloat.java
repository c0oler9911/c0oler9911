package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    static final  double π1=3.14;
    static final  float π2=3.14f;

    public static Double volumeBallDouble(Double radius){
       double Q=(4*π1)/3*radius*radius*radius;
       return Q;
    }
    public static Float volumeBallFloat(Float radius){
        float Q=(4*π2)/3*radius*radius*radius;
        return Q;
    }
    public static Double calculateAccuracy(Double radius){
        Float RAD=radius.floatValue();
        double RAZ=volumeBallDouble(radius)-volumeBallFloat(RAD);
        return RAZ;
    }

    public static void main(String[] args) {
        System.out.println("a = "+volumeBallFloat(6371.2f));
        System.out.println("b = "+volumeBallDouble(6371.2));
        System.out.println("c = "+calculateAccuracy(6371.2));

        }
    }
