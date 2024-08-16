package my.company;

public class Twenty_one {
    void methodTwentyOne() {
        //Условие задачи: найти сумму четных чисел и их количество в диапазоне от 1 до 99
        int sum = 0;
        int count = 0;
        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                sum += i;
                count++;
            }
        }
        System.out.println("Сумма четных чисел от 1 до 99 =  " + sum);
        System.out.println("Количество четных чисел от 1 до 99 = " + count);

    }

}
