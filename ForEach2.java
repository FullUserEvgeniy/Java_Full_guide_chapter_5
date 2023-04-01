// Использование break с циклом for в стиле " for-each "
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            sum += x;
            System.out.println("В данный момент x = " + x);
            if (x == 6) break;
        }
        System.out.println("Сумма первых шести чисел в массиве равна: " + sum);
    }
}
/*
В данный момент x = 1
В данный момент x = 2
В данный момент x = 3
В данный момент x = 4
В данный момент x = 5
В данный момент x = 6
 */
