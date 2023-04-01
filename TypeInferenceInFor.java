// Использование выведения типов локальных переменных в цикле for
public class TypeInferenceInFor {
    public static void main(String[] args) {
        System.out.println("Значение x: ");
        for (var x = 2.5; x < 100.0; x *= 2) System.out.println(x + " ");
        System.out.println();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (var x : nums) System.out.println("Значение в массиве: " + x);
        System.out.println();
    }
}
/*
Значение x:
2.5
5.0
10.0
20.0
40.0
80.0

Значение в массиве: 1
Значение в массиве: 2
Значение в массиве: 3
Значение в массиве: 4
Значение в массиве: 5
Значение в массиве: 6
Значение в массиве: 7
Значение в массиве: 8
Значение в массиве: 9
Значение в массиве: 10
 */