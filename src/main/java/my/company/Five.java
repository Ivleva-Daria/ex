package my.company;

import java.util.Scanner;

public class Five {
    void methodFive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a ");
        int a = sc.nextInt();
        System.out.print("Введите число b ");
        int b = sc.nextInt();
        System.out.print("Введите число c ");
        int c = sc.nextInt();
        int max = Math.max(a * b * c, a + b + c) + 3;
        System.out.print("Максимальное выражение " + max);
    }

}
