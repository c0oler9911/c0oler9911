package ru.progwards.java1.lessons.static1;

public class CalcTime {
    static double distance; // тип - число с плавающей точкой, расстояние
    static double speed; // тип - число с плавающей точкой, скорость
    static String cityFrom; // - тип строка, город, откуда едем
    static String cityTo; //- тип строка, город, куда едем
    public static void printTime() {
        double time = distance/speed;
        String citiTo;
        System.out.println("Если ехать из "+cityFrom+" в "+cityTo+" со скоростью "+speed+" км/ч, то "+distance+" км проедем за "+time+" часов");
    }
    public static void MoscowToPiter(){
    distance=712;
    speed=80;
    cityFrom="Москва";
    cityTo="Питер";
            }
    public static void LissabonToVladivostok(){
        distance=13090;
        speed=75;
        cityFrom="Лиссабон";
        cityTo="Владивосток";
            }
    public static void MurmanskToAlmata(){
        distance=5413;
        speed=60;
        cityFrom="Мурманск";
        cityTo="Алмата";
    }
    public static void printTimes(){
        MoscowToPiter();
        printTime();
        LissabonToVladivostok();
        printTime();
        MurmanskToAlmata();
        printTime();
    }
    public static void main(String[] args){
        printTimes();
    }
}

