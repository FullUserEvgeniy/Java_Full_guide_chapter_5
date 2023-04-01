// Простой пример применения оператора switch
public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            switch (i){
                case 0:
                    System.out.println("i равно нулю");
                    break;
                case 1:
                    System.out.println("i равно единице");
                    break;
                case 2:
                    System.out.println("i равно двум");
                    break;
                case 3:
                    System.out.println("i равно трем");
                    break;
                case 4:
                    System.out.println("i равно четырем");
                    break;
                case 5:
                    System.out.println("i равно пяти");
                    break;
                case 6:
                    System.out.println("i равно шести");
                    break;
                default:
                    System.out.println("i больше шести");
            }
        }
    }
}
/*
i равно нулю
i равно единице
i равно двум
i равно трем
i равно четырем
i равно пяти
i равно шести
i больше шести
i больше шести
i больше шести
 */