// Использование цикла for в стиле "for-each"
public class ForEach {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x:nums) {
            sum += x;
            System.out.println("В данный момент x = " + x);
        }
        System.out.println("Сумма всех чисел в массиве равна: " + sum);
    }
}
/*
В данный момент x = 1
В данный момент x = 2
В данный момент x = 3
В данный момент x = 4
В данный момент x = 5
В данный момент x = 6
В данный момент x = 7
В данный момент x = 8
В данный момент x = 9
В данный момент x = 10
 */