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
        int previousYear = currentYear - 200;
        int nextYear = currentYear + 100;
        for (; previousYear < currentYear; currentYear--) {
            if (currentYear % 79 == 0);
        }
        for (; currentYear < nextYear; currentYear++) {
            if (currentYear % 79 == 0)
                    System.out.println(currentYear);
            }
        }
    }




