// Демонстрация работы цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        int m = 11;
        do {
            System.out.println(" Цикл " + (m - n));
        } while (--n > 0);
    }
}
/*  Цикл 1
    Цикл 2
    Цикл 3
    Цикл 4
    Цикл 5
    Цикл 6
    Цикл 7
    Цикл 8
    Цикл 9
    Цикл 10
    */