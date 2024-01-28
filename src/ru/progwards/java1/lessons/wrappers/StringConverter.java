package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number){
        Byte numa = number;
        String c = numa.toString();
        System.out.println(c);
        return c;
    }
    public static String fromShort(short number){
        Short numa = number;
        String c = numa.toString();
        System.out.println(c);
        return c;
    }
    public static String fromInt(int number){
        Integer numa = number;
        String c = numa.toString();
        System.out.println(c);
        return c;}
    public static String fromLong(long number){
        Long numa = number;
        String c = numa.toString();
        System.out.println(c);
        return c;
    }
    public static String fromFloat(float number){
        Float numa = number;
        String c = numa.toString();
        System.out.println(c);
        return c;
    }
    public static String fromDouble(double number){
        Double numa = number;
        String c = numa.toString();
        System.out.println(c);
        return c;
    }
}
