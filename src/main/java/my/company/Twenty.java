package my.company;

public class Twenty {
    public static int recCalculation(int nNew) {
        if (nNew == 0){
            return 1;
        }
        int f = nNew * recCalculation(nNew -1 );
        return f;
    }
}
