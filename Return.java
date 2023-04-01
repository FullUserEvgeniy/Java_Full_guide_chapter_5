// Демонстрация работы return
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Перед оператором return ");
        if (t) return;
        System.out.println("Эта строка выведена не будет");
    }
}
/*
Перед оператором return
 */