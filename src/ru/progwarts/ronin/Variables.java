package ru.progwarts.ronin;

public class Variables {
    static int sum = 0;

    public static void increment(int n) {
        sum = sum + n;
    }

    public static void decrement(int n) {
        sum = sum - n;
    }

    public static void printSum() {
        System.out.println("sum = " + sum);
    }

    public static void calculation() {
        increment(12);
        printSum();
        decrement(8);
        printSum();
        increment(-7);
        printSum();
    }

    public static void roomParameters(String room, int length, int width) {
        int floor = length * width;
        int perimeter = 2 * (length + width);
        int height = 3;
        int walls = height * perimeter;
        System.out.println("Комната " + room + ", нужно линолеума " + floor + " м2, обоев "+ walls+" м2, при высоте потолков " + height + " м");
    }

    public static void apartment() {
        roomParameters("гостинная", 4, 5);
        roomParameters("кухня", 3, 3);
        roomParameters("спальня", 3, 4);
        roomParameters("прихожая", 2, 2);
    }

    public static String getFirst() {
        String hoho="Не тот велик, ";
        return hoho;
    }

    public static String getSecond() {
        String allo="кто никогда не падал, ";
        return allo;
    }

    public static String  getThird() {
        String omg = "а тот велик — ";
        return  omg;
    }

    public static String getForth() {
        String get="кто падал и вставал!. ";
        return get;
    }

    public static String getFifth() {
        String getF = "Конфуций";
        return getF;
    }

    public static void printText() {
        String text;
        text = getFirst();
        System.out.println(text);
        text = text + getSecond();
        System.out.println(text);
        String text2;
        text2 = getThird() + getForth();
        System.out.println(text2);
        System.out.println(getFifth());
        System.out.println(text + text2 + getFifth());
    }
    public static void main(String[] args) {
        calculation();
        apartment();
        printText();
    }
}
