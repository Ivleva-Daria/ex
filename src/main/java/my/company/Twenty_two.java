package my.company;

public class Twenty_two {
    void methodTwentyTwo() {
        //Условие задачи:вывести шахматную доску, в которой нечетные строки будут заполнены "*", а четные - пропуском
        String[][] chess = new String[8][6];
        for (int n = 0; n < chess.length; n++) {
            for(int m = 0; m < chess[n].length; m++){
                if (n % 2 == 0){
                    chess[n][m] = "  ";
                }
                else{
                    chess[n][m] = " * ";
                }
                System.out.print(chess[n][m]);
            }
            System.out.println();

        }

    }
}