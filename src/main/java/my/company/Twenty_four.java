package my.company;

public class Twenty_four {
    long methodTwentyFour(int newNumber) {
        //Условие задачи: Написать рекурсивный метод расчета чисел Фибоначчи
        if (newNumber <=2){
            return 1;
        }
        long f = methodTwentyFour(newNumber - 1) + methodTwentyFour(newNumber - 2);
        return f;
    }
}
