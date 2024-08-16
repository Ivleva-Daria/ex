package my.company;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Выбор номера заадачи
        System.out.print("Ввведите номер задачи: ");
        //Выбор способа чтения
        int chNew = methodRead();
        //Работа задачи
        Tasks tasks = new Tasks();
        tasks.methodTask(chNew);

    }
    //Методы чтения
    private static int  methodRead() {
        int ch1 = readScanner();
        //int ch2 = readBuffer();
        return ch1;
    }
    //Метод чтения Scanner
    private static int readScanner(){
        Scanner choice = new Scanner(System.in);
        int ch1 = choice.nextInt();
        return ch1;
    }
    //Метод чтения BufferedReader
    /*private static int readBuffer(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ch2 = reader.readLine();
            return Integer.parseInt(ch2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
            return -1;
        }
    }*/

}

