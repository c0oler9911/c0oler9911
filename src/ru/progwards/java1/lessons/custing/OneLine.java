package ru.progwards.java1.lessons.custing;

public class OneLine {
    public static String strValue(String value){
        String s1= "Передана строка со значением \""+value+"\"";
        return s1;
    }
    public static String intValue(String variable,  int value){
        String s2= STR."Значение \{variable} равно \{value}";
        return s2;
    }
    public static String square(int n){
        Integer n1 = n;
        String a = n1.toString();
        int n2=n*n;
        Integer n2n = n2;
        String b = n2n.toString();
        String s="Число "+a+" в квадрате равно "+b;
        return s;
    }
    public static String sum(int n, int m){
        Integer n1 = n;
        String a = n1.toString();
        Integer m1=m;
        String b = m1.toString();
        int sum=n=m;
        Integer sum1 = sum;
        String sum2 = sum1.toString();
        String s="Сумма "+a+" и "+b+ " равна "+sum2;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(strValue("1234"));
        System.out.println(intValue("opapa",1245));
        System.out.println(square(5));
    }

}