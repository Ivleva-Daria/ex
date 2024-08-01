package my.company;

import java.util.Scanner;

public class Twelve {
    void methodTwelve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        System.out.print("Выберите  less или more: ");
        String choice = sc.next().toLowerCase();
        if(choice.equals("less")){
            for(int i = 1; i*i < n; i++){
                System.out.print(" " + i + " ");
            }
        }else if(choice.equals("more")){
            for(int i = 1; i*i < n; i++){
                if(i*i == n-1){
                    System.out.print("От " + (i + 1) + " до +бесконечности");
                }
            }
        }
    }
}
