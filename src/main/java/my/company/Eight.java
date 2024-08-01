package my.company;

import java.util.Scanner;

public class Eight {
    void methodEight() {
        //Задача №2
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(" " + i + " ");
            }
        }
    }

}
