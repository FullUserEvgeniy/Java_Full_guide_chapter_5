// Демонстрация работы continue
public class Continue {
    public static void main(String[] args) {
        System.out.print("Печать нечетных чисел:  ");
        for (int i = 0; i < 10; i ++){
            if (i%2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
/*
Печать нечетных чисел:  1 3 5 7 9
 */