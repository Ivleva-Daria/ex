package my.company;

public class Seventeen {
    public Integer factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        System.out.print("Факториал числа " + n + ": " + f);
        return f;
    }


}
