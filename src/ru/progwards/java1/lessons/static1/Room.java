package ru.progwards.java1.lessons.static1;

public class Room {
    static double length1=5;// тип - число с плавающей точкой, длина 1-й комнаты, проинициализировать значением 5
    static double width1=3;// тип - число с плавающей точкой, ширина 1-й комнаты, проинициализировать значением 3
    static double length2=length1+1.5;// - число с плавающей точкой, длина 2-й комнаты, проинициализировать значением length1+1.5
    static double width2=width1*1.5;//- число с плавающей точкой, ширина 2-й комнаты, проинициализировать значением width1*1.5
    static double square1=square(length1, width1); //- число с плавающей точкой, площадь 1-й комнаты, проинициализировать значением функции square(length1, width1)
    static double square2=square(length2, width2);//- число с плавающей точкой, площадь 2-й комнаты, проинициализировать значением функции square(length2, width2)
    public static double square(double length, double width){
        return length*width;
    }
    public static void printRoom(String name, double square) {
        System.out.println("Площадь " + name + " составляет " + square + " м2");
    }
    public static void printFlat(){
        printRoom("кухни",square1);
        printRoom("гостинной", square2);
    }public static void main(String[] args){
        printFlat();
    }
}