package my.company;

import java.util.Scanner;

public class Two {
    void methodTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a ");
        int a = sc.nextInt();
        System.out.print("Введите число b ");
        int b = sc.nextInt();
        if (a % 2 == 0) {
            System.out.print(a * b);
        } else {
            System.out.print(a + b);
        }
    }
}
