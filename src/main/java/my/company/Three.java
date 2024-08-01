package my.company;

import java.util.Scanner;

public class Three {
    void methodThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = sc.nextInt();
        System.out.print("Введите y: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.print("Первая четверть");
        } else if (x < 0 && y > 0) {
            System.out.print("Вторая четверть ");
        } else if (x < 0 && y < 0) {
            System.out.print("Третья четверть ");
        } else if (x > 0 && y < 0) {
            System.out.print("Четвертая четверть ");
        }
    }
}
