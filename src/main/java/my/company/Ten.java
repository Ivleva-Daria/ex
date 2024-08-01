package my.company;

import java.util.Arrays;

public class Ten {
    void methodTen() {
        //Задача №4-7
        int[] x = new int[]{1, 2, 3, 4, 5, 2, 3, 4, 5, 4, 5, 5};
        int max = Arrays.stream(x).max().getAsInt();
        System.out.println("Максимальное число: " + max);

        int m = x[0];
        int MaxIndex = 0;
        for (int i = 0; i < x.length; i++) {
            int y = x[i];
            if (m < y) {
                m = y;
                MaxIndex = i;
            }
        }
        System.out.println("Индекс максимального числа: " + MaxIndex);


        int sum = 0;
        for (int i = 0; i < x.length; i = i + 2) {
            sum += x[i];
        }
        System.out.println("Сумма элементов с нечетными индексами: " + sum);

        int mc = 0;
        int f = 0;
        for (int i = 0; i < x.length; i++) {
            int c = 0;
            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j]) {
                    c++;
                }
            }
            if (c > mc) {
                mc = c;
                f = x[i];
            }
        }
        System.out.print("Наиболее повторяющееся число: " + f);

    }
}
