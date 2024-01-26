package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int _100=number/100;
        int _10=number%100/10*10;
        int _1=number%100%10/1*100;
        number=_1+_10+_100;
        return number;
    }
    public static void main(String[] args){
        System.out.println(reverseDigits(4));
    }
}
