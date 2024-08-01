package my.company;

import java.util.Scanner;

public class One {
    void methodOne() {
        //Задача 1.1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a = sc.nextInt();
        System.out.print("Введите второе число ");
        int b = sc.nextInt();
        System.out.print("Введите третье число ");
        int c = sc.nextInt();
        sc.close();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.print("Наибольшее число- " + max);
    }
}
