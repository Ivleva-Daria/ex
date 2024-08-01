package my.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1.1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a = sc.nextInt();
        System.out.print("Введите второе число ");
        int b = sc.nextInt();
        System.out.print("Введите третье число ");
        int c = sc.nextInt();
        sc.close();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.print("Наибольшее число- " + max);

    }

    public class Three {
        public static void main(String[] args) {
            //Задача 2
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число a ");
            int a = sc.nextInt();
            System.out.print("Введите число b ");
            int b = sc.nextInt();
            if (a % 2 == 0) {
                System.out.print(a * b);
            } else {
                System.out.print(a + b);
            }
        }
    }

    public class Four {
        public static void main(String[] args) {
            //Задача 3
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите x: ");
            int x = sc.nextInt();
            System.out.print("Введите y: ");
            int y = sc.nextInt();
            if (x > 0 && y > 0) {
                System.out.print("Первая четверть");
            } else if (x < 0 && y > 0) {
                System.out.print("Вторая четверть ");
            } else if (x < 0 && y < 0) {
                System.out.print("Третья четверть ");
            } else if (x > 0 && y < 0) {
                System.out.print("Четвертая четверть ");
            }
        }
    }

    public class Five {
        public static void main(String[] args) {
            //Задача 4
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

    public class Six {
        public static void main(String[] args) {
            //Задача 5
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число a ");
            int a = sc.nextInt();
            System.out.print("Введите число b ");
            int b = sc.nextInt();
            System.out.print("Введите число c ");
            int c = sc.nextInt();
            int max = Math.max(a * b * c, a + b + c) + 3;
            System.out.print("Максимальное выражение " + max);
        }
    }

    public class Seven {
        public static void main(String[] args) {
            //Задача 1
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

    public class Eight {
        public static void main(String[] args) {
            //Задача №1
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите колличество баллов ");
            int x = sc.nextInt();
            if (0 <= x && x <= 19) {
                System.out.print("Оценка F");
            } else if (20 <= x && x <= 39) {
                System.out.print("Оценка E");
            } else if (40 <= x && x <= 59) {
                System.out.print("Оценка D");
            } else if (60 <= x && x <= 74) {
                System.out.print("Оценка C");
            } else if (75 <= x && x <= 89) {
                System.out.print("Оценка B");
            } else if (90 <= x && x <= 100) {
                System.out.print("Оценка A");
            }
        }
    }

    public class Nine {
        public static void main(String[] args) {
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

    public class Ten {
        public static void main(String[] args) {
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

    public class Eleven {
        public static void main(String[] args) {
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

    public class Twelve {
        public static void main(String[] args) {
            //Задача №8
            //Сортировка пузырьком
            int[] x = new int[]{5, 6, 8, 4, 3};
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < x.length - 1; i++) {
                    if (x[i] > x[i + 1]) {
                        temp = x[i];
                        x[i] = x[i + 1];
                        x[i + 1] = temp;
                        sorted = false;
                    }
                    System.out.print(x[i] + "  ");
                }
            }
            System.out.print("    ");
            //Сортировка выбором
            int[] array = new int[]{1, 4, 6, 5, 3, 2};
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minId = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minId = j;
                    }
                }
                // замена
                int t = array[i];
                array[i] = min;
                array[minId] = t;
                System.out.print(array[i] + " ");
            }
            System.out.print("    ");

            //Сортировка вставками
            int[] ar = new int[]{1, 7, 8, 9, 0, 6, 5, 4};
            int j;
            //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
            for (int i = 1; i < ar.length; i++) {
                //сохраняем ссылку на индекс предыдущего элемента
                int swap = ar[i];
                for (j = i; j > 0 && swap < ar[j - 1]; j--) {
                    //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                    ar[j] = ar[j - 1];
                }
                ar[j] = swap;
                System.out.print(ar[i] + " ");
            }
        }
    }
}

