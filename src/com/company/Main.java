package com.company;
////Task1
public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int x = 10; x > 0; x--) {
            System.out.print(x + " ");


        }
    }
}
///Task2
class Task2 {

    public static void main(String[] args) {
        for (int i = 4; i < 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + "-e число. Необходимо отправить отчет." );
        }
    }
}
////Task3
class Task3 {
    public static void main(String[] args) {
        int currentYear = 2021;
        for (int i = 1896; i <= 2121; i += 79) {
            System.out.println(i);
        }
    }
}


