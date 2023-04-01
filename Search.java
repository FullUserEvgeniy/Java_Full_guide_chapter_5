// Поиск в массиве с использованием цикла for в стиле " for-each "
public class Search {
    public static void main(String[] args) {
        int[] nums = {3, 7, 6, 9, 5, 0, 2, 3, 5, 8, 1, 0, 1, 4, 6, 4, 6, 9, 7, 3};
        int val = 5;
        boolean found = false;
        int count = 0;
        for (int x : nums){
            if (x == val){
                count ++;
                found = true;
            }
        }
        if (found) System.out.println("Количество значений " + val + " в массиве равно: " + count);
        else System.out.println("Значений " + val + " в массиве не найдено.");
    }
}
/*
Количество значений 5 в массиве равно: 2
 */