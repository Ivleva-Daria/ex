package my.company;

import java.util.Scanner;

public class Four {
    void methodFour() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a = sc.nextInt();
        System.out.print("Введите второе число ");
        int b = sc.nextInt();
        System.out.print("Введите третье число ");
        int c = sc.nextInt();
        int sum = 0;
        if (a > 0) {
            sum += a;
        }
        if (b > 0) {
            sum += b;
        }
        if (c > 0) {
            sum += c;
        }
        System.out.println("Сумма положительных чисел: " + sum);
    }
}
