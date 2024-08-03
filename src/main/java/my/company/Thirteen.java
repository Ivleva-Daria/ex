package my.company;

import java.util.Scanner;

public class Thirteen {
    void methodthirteen() {
        /*Scanner sc = new Scanner(System.in);
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
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите, длину какой сторны Вы ищете (1_катет, 2_катет или гипотенузу):");
        String a = sc.next();
        double[] m = new double[3];
        if(a.equals("1_катет")){
            System.out.print("Укажите длину 2 катета: ");
             m[1] = sc.nextDouble();
            System.out.print("Укажите длину гипотенузы: ");
             m[2] = sc.nextDouble();
             m[0]  = (m[2] * m[2]) - (m[1] * m[1]);
             int x = (int) Math.pow(m[0],0.5);
            System.out.print("Длина катета 1: " + x );
        }else if(a.equals("2_катет")){
            System.out.print("Укажите длину 1 катета: ");
            m[0] = sc.nextDouble();
            System.out.print("Укажите длину гипотенузы: ");
            m[2] = sc.nextDouble();
            m[1]  = (m[2] * m[2]) - (m[0] * m[0]);
            int x = (int) Math.pow(m[1],0.5);
            System.out.print("Длина катета 2: " + x );
        }else if(a.equals("гипотенуза")){
            System.out.print("Укажите длину 1 катета: ");
            m[0] = sc.nextDouble();
            System.out.print("Укажите длину 2 катета: ");
            m[1] = sc.nextDouble();
            m[2]  = (m[0] * m[0]) + (m[1] * m[1]);
            int x = (int) Math.pow(m[2],0.5);
            System.out.print("Длина гипотенузы: " + x );
        }
    }


}
