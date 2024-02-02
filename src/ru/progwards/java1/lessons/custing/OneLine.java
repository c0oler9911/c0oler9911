package ru.progwards.java1.lessons.custing;
public class OneLine {
    public static String strValue(String value){
        return "Передана строка со значением \""+value+"\"";
    }
    public static String intValue(String variable,  int value){
        return  "Значение "+variable+ " равно "+Integer.toString(value);
    }
    public static String square(int n){
        return "Число "+Integer.toString(n)+" в квадрате равно "+Integer.toString((int) Math.pow(n, 2));
    }
    public static String sum(int n, int m){
        return "Сумма "+n+" и "+m+ " равна "+(n+m);
    }
    public static void main(String[] args) {
        System.out.println(strValue("1234"));
        System.out.println(intValue("opapa",1245));
        System.out.println(square(5));
        System.out.println(sum(5,10));
    }
}
