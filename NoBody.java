// Тело цикла может быть пустым
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j);
        System.out.println("Средняя точка равна " + j);
    }
}
/*
Средняя точка равна 150
 */