// Усовершен твованная версия программы, определяющей принадлежность
// месяца к времени года
public class Switch {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++){
            int j = (int) ((Math.random() * 10) + (Math.random() * 10));
            switch (j){
                case 1:
                    System.out.println("январь");
                    break;
                case 2:
                    System.out.println("февраль");
                    break;
                case 3:
                    System.out.println("март");
                    break;
                case 4:
                    System.out.println("апрель");
                    break;
                case 5:
                    System.out.println("май");
                    break;
                case 6:
                    System.out.println("июнь");
                    break;
                case 7:
                    System.out.println("июль");
                    break;
                case 8:
                    System.out.println("август");
                    break;
                case 9:
                    System.out.println("сентябрь");
                    break;
                case 10:
                    System.out.println("октябрь");
                    break;
                case 11:
                    System.out.println("ноябрь");
                    break;
                case 12:
                    System.out.println("декабрь");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
        }
    }
}
/*
октябрь
сентябрь
август
декабрь
август
декабрь
октябрь
Такого месяца не существует
июль
ноябрь
Такого месяца не существует
декабрь
июль
 */