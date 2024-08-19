package my.company;

public class Twenty_three {
    public static boolean methodTwentyThree(String str) {
        //Условие задачи: Напишите программу, которая определяет, является ли введенное число палиндромом
        int left = 0;
        int right = str.length() -1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
