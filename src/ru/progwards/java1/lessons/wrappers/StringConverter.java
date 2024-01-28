package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number){
        Byte num = Byte.parseByte(fromByte(number));
        String a = num.toString();
        String fromByte = fromByte(number);
        return fromByte;
    }
    public static String fromShort(long number){
        String b = fromShort(number);
        return b;
    }
    public static String fromInt(int number){
        String c = fromInt(number);
        return c;
    }
    public static String fromLong(long number){
        String d = fromLong(number);
        return d;
    }
    public static String fromFloat(float number){
        String e = fromFloat(number);
        return e;
    }
    public static String fromDouble(double number){
        String f = fromDouble(number);
        return f;
}

    public static void main(String[] args) {
        System.out.println(fromDouble(1.0));
    }

}