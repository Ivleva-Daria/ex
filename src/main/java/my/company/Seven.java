package my.company;

import java.util.Scanner;

public class Seven {
    void methodSeven() {
        //Задача №1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите колличество баллов ");
        int x = sc.nextInt();
        if (0 <= x && x <= 19) {
            System.out.print("Оценка F");
        } else if (20 <= x && x <= 39) {
            System.out.print("Оценка E");
        } else if (40 <= x && x <= 59) {
            System.out.print("Оценка D");
        } else if (60 <= x && x <= 74) {
            System.out.print("Оценка C");
        } else if (75 <= x && x <= 89) {
            System.out.print("Оценка B");
        } else if (90 <= x && x <= 100) {
            System.out.print("Оценка A");
        }

    }
}
