package my.company;

public class Eleven {
    void methodEleven() {
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
