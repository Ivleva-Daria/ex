package my.company;

import java.util.Scanner;

public class Fifteen {
    void methodfifteen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = sc.nextInt();
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x /= 10;
        }
        System.out.print("Сумма цифр, введенного числа: " + sum);
    }
}
