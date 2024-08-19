package my.company;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import static my.company.Twenty_three.*;

public class Tasks {
    void methodTask(int chNew) {
        switch(chNew) {
            case 1:
                One one = new One();
                one.methodOne();
                break;
            case 2:
                Two two = new Two();
                two.methodTwo();
                break;
            case 3:
                Three three = new Three();
                three.methodThree();
                break;
            case 4:
                Four four = new Four();
                four.methodFour();
                break;
            case 5:
                Five five = new Five();
                five.methodFive();
                break;
            case 6:
                Six six = new Six();
                six.methodSix();
                break;
            case 7:
                Seven seven = new Seven();
                seven.methodSeven();
                break;
            case 8:
                Eight eight = new Eight();
                eight.methodEight();
                break;
            case 9:
                Nine nine = new Nine();
                nine.methodNine();
                break;
            case 10:
                Ten ten = new Ten();
                ten.methodTen();
                break;
            case 11:
                Eleven eleven = new Eleven();
                eleven.methodEleven();
                break;
            case 12:
                Twelve twelve = new Twelve();
                twelve.methodTwelve();
                break;
            case 13:
                Thirteen thirteen = new Thirteen();
                thirteen.methodthirteen();
                break;
            case 14:
                Fourteen fourteen = new Fourteen();
                fourteen.methodfourteen();
                break;
            case 15:
                Fifteen fifteen = new Fifteen();
                fifteen.methodfifteen();
                break;
            case 16:
                Sixteen sixteen = new Sixteen();
                sixteen.methodsixteen();
                break;
            case 17:
                Seventeen factorial = new Seventeen();
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите число n: ");
                int n = sc.nextInt();
                factorial.factorial(n);
                break;
            case 18:
                Eighteen dayOfTheWeek = new Eighteen();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите номер дня недели: ");
                int d = scanner.nextInt();
                dayOfTheWeek.dayOfTheWeek(d);
                break;
            case 19:
                Nineteen numberWord = new Nineteen();
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Введите число: ");
                int num = scanner1.nextInt();
                numberWord.numberWord(num);
                break;
            case 20:
                Twenty recCalculation = new Twenty();
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Введите число n: ");
                try {
                    String number = read.readLine();
                    int nNew = Integer.parseInt(number);
                    long result = recCalculation.recCalculation(nNew);
                    System.out.print("Факториал числа " + nNew + " = " + result);
                }catch (IOException e) {
                    System.out.println("Ошибка ввода");
                }
                catch (NumberFormatException e){
                    System.out.println("Введите корректное число ");
                }
                break;
            case 21:
                Twenty_one twentyOne = new Twenty_one();
                twentyOne.methodTwentyOne();
                break;
            case 22:
                Twenty_two twentyTwo = new Twenty_two();
                twentyTwo.methodTwentyTwo();
                break;
            case 23:
                Twenty_three twentyThree = new Twenty_three();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите число: ");
                try{
                    String number = br.readLine();
                    if(methodTwentyThree(number)) {
                        System.out.println(number + " является палиндромом");
                    }else {
                        System.out.println(number + " не является палиндромом");
                    }
                }
                catch (IOException e){
                    System.out.println(" ");
                }
                break;
            case 24:
                Twenty_four twentyFour = new Twenty_four();
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите число: ");
                try{
                    String number2 = reader2.readLine();
                    int newNumber = Integer.parseInt(number2);
                    long result2 = twentyFour.methodTwentyFour(newNumber);
                    System.out.print("F" + "(" + newNumber + ")" + " = " + result2);
                }
                catch (IOException e){
                    System.out.println(" ");
                }
                break;
            case 25:
                Twenty_five twentyFive = new Twenty_five();
                twentyFive.methodTwentyFive();
        }
    }
}
