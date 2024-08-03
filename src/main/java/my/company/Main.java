package my.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        System.out.print("Ввведите номер задачи: ");
        int ch = choice.nextInt();
        switch(ch) {
            case 1: One one = new One();
            one.methodOne();
            break;
            case 2: Two two = new Two();
            two.methodTwo();
            break;
            case 3: Three three = new Three();
            three.methodThree();
            break;
            case 4: Four four = new Four();
            four.methodFour();
            break;
            case 5: Five five = new Five();
            five.methodFive();
            break;
            case 6: Six six = new Six();
            six.methodSix();
            break;
            case 7: Seven seven = new Seven();
            seven.methodSeven();
            break;
            case 8: Eight eight = new Eight();
            eight.methodEight();
            break;
            case 9: Nine nine = new Nine();
            nine.methodNine();
            break;
            case 10: Ten ten = new Ten();
            ten.methodTen();
            break;
            case 11: Eleven eleven = new Eleven();
            eleven.methodEleven();
            break;
            case 12: Twelve twelve = new Twelve();
            twelve.methodTwelve();
            break;
            case 13: Thirteen thirteen = new Thirteen();
            thirteen.methodthirteen();
            break;
            case 14: Fourteen fourteen = new Fourteen();
            fourteen.methodfourteen();
            break;
            case 15: Fifteen fifteen = new Fifteen();
            fifteen.methodfifteen();
            break;
        }
    }

}

