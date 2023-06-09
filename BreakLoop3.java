// Использование break с вложенными циклами
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 100; j ++){
                if (j == 4) break;
                System.out.println("Значение i = " + i + ", значение j = " + j);
            }
        }
        System.out.println("Если значение j не равнялось 99, то внутренний цикл завершался по break");
    }
}
/*
Значение i = 0, значение j = 0
Значение i = 0, значение j = 1
Значение i = 0, значение j = 2
Значение i = 0, значение j = 3
Значение i = 1, значение j = 0
Значение i = 1, значение j = 1
Значение i = 1, значение j = 2
Значение i = 1, значение j = 3
Если значение j не равнялось 99, то внутренний цикл завершался по break
 */