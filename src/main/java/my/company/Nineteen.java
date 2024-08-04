package my.company;

public class Nineteen {
    private static final String[] units = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private static final String[] teens = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать "};
    private static final String[] tens = {"", " ", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static final String[] hundreds = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

    public Integer numberWord(int num) {
        if(num < 10){
            System.out.print(units[num]);
        }
        else if(num < 20) {
            System.out.print(teens[num - 10]);
        }
        else if (num < 100) {
            System.out.print(tens[num/10] + (num % 10 != 0 ? " " + units[num % 10] : ""));
        }
        else if (num < 1000){
            System.out.print(hundreds[num / 100 - 1] + (num % 100  != 0 ? " " + tens[num % 100 / 10]+ " " + units[num % 100 % 10 ] : ""));
        }
        else{
            System.out.print(units[num / 1000] + " " + "тысяча/тысячи/тысяч" + (num % 1000 != 0 ? " " + hundreds[num / 100 / 10 - 2] + " " + tens[num % 1000 % 100 / 10] + " "+ units[num % 1000 % 10] : ""));
        }
        return num;
    }

}
