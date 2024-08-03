package my.company;

public class Fourteen {
    void methodfourteen() {
        int[] a = { 1, 2, 3, 4, 5};
        System.out.print("Массив перед реверсом: " );
        for(int b = 0; b < a.length; b++){
            System.out.print(a[b] + " ");
        }
        System.out.println(" ");
        System.out.print("Массив после реверса: ");
        for(int c = a.length - 1; c >= 0; c--){
            System.out.print(a[c] + " ");
        }
    }
}
