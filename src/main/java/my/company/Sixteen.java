package my.company;

import java.util.Scanner;

public class Sixteen {
    void methodsixteen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int x = sc.nextInt();
        System.out.print("Введите элементы массива: ");
        int[] y = new int[x];
        for(int i = 0; i < x; i++){
            y[i] = sc.nextInt();
        }
        int n = 1;
        for(int i = 0; i < y.length; i++){
            if (y[i] % 2 != 0){
                n++;
            }
        }
        System.out.print("Количество нечетных элементов: " + n);
    }

}
