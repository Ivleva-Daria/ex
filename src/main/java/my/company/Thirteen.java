package my.company;

import java.util.Scanner;

public class Thirteen {
    void methodthirteen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите, длину какой сторны Вы ищете (1_катет, 2_катет или гипотенузу): ");
        String s = sc.next();
        switch (s) {
            case "1_катет" -> {
                System.out.print("Укажите длину 2 катета: ");
                int k2 = sc.nextInt();
                System.out.print("Укажите длину гипотенузы: ");
                int g = sc.nextInt();
                for(int x = 0; x < g; x++){
                    if((x*x) + (k2*k2) == (g*g)){
                        System.out.print("1 катет равен " + x);}
                }
            }
            case "2_катет" -> {
                System.out.print("Укажите длину 1 катета: ");
                int k1 = sc.nextInt();
                System.out.print("Укажите длину гипотенузы: ");
                int g = sc.nextInt();
                for(int x = 0; x < g; x++){
                    if((k1*k1) + (x*x) == (g*g)){
                    System.out.print("2 катет равен " + x);}
                }
            }
            case "гипотенуза" -> {
                System.out.print("Укажите длину 1 катета: ");
                int k1 = sc.nextInt();
                System.out.print("Укажите длину 2 катета: ");
                int k2 = sc.nextInt();
                for (int x = 0; x >= 0; x++) {
                    if ((k1 * k1) + (k2 * k2) == (x * x)) {
                        System.out.print("Гипотенуза равна " + x);
                        break;
                    }
                }
            }
        }
    }
}
