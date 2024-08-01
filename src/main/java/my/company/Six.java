package my.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Six {
    void methodSix() {
        //Задача 1.3
        Scanner sc = new Scanner(System.in);
        //Массив из количества чисел
        System.out.print("Введите число (количество чисел для сравнения) от 1 до 5: ");
        int count = sc.nextInt();
        ArrayList<Integer> c = new ArrayList<Integer>();
        // Ввод чисел
        for (int i = 0; i < count; i++) {
            System.out.println("Введите число " + (i + 1) + ":");
            int n = sc.nextInt();
            c.add(n); // Добавляем введенное число в коллекцию Array List
        }
        // Выбор min или max
        System.out.print("Выберите min  или max: ");
        String ch = sc.next().toLowerCase();
        //Вывод результата
        if (ch.equals("min")) {
            System.out.println("Минимальное число: " + Collections.min(c));
        } else if (ch.equals("max")) {
            System.out.println("Максимальное число: " + Collections.max(c));
        }
        sc.close();
    }
}
