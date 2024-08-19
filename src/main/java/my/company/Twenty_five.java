package my.company;
import java.util.Arrays;

public class Twenty_five {
    public static void methodTwentyFive() {
        //Условие задачи: дан массив целых чисел и еще одно целое число.Удалите все вхождения этого числа из массива без пропусков
        int[] array = {1, 2, 3, 4, 5, 5, 5, 6, 7, 4, 3, 5};
        int number = 5;

        int count = 0;
        for(int num : array){
            if(num != number){
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;
        for(int num: array){
            if(num != number){
                newArray[index++] = num;
            }
        }
        System.out.println(Arrays.toString(newArray));


    }
}
