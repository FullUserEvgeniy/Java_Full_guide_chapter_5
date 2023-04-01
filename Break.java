// Использование break в качестве "цивилизованной" формы перехода в стиле "goto"
public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Перед оператором break");
                    if (t) break second;
                    System.out.println("Эта строка не должна появиться");
                }
                System.out.println("Эта строка не должна появиться");
            }
            System.out.println("Выполнение после блока second: {} ");
        }
    }
}
/*
Перед оператором break
Выполнение после блока second: {}
 */