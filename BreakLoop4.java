// Использование break для выхода из вложенных циклов
public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i ++){
            System.out.print("Проход " + i + " : ");
            for (int j = 0; j < 100; j ++){
                if (j == 6) break outer;
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не должна быть выведена");
        }
        System.out.println("\nЦиклы завершены.");
    }
}
/*
Проход 0 : 0 1 2 3 4 5
Циклы завершены.
 */