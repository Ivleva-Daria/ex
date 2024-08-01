package my.company;

import java.util.Scanner;

public class Nine {
    void methodNine() {
        //Задача №3
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите положительное число n:  ");
        int n = sc.nextInt();
        long f = 1;
        if (n < 0) {
            System.out.print("Введите положительное натуральное число ");
        } else {
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.print(f);
        }
    }
}
