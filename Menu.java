// Исполь зование цикла do-while для обработки выбора пункта меню
public class Menu {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do {
            System.out.println(" Краткая справка по: ");
            System.out.println(" 1.if ");
            System.out.println(" 2.switch ");
            System.out.println(" 3.while ");
            System.out.println(" 4.do-while ");
            System.out.println(" 5.for ");
            System.out.println(" Выбирите вариант: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println();
        switch (choice){
            case '1':
                System.out.println(" Оператор if: ");
                System.out.println(" if( условие ) { \n оператор; } ");
                System.out.println(" else { оператор; } ");
                break;
            case '2':
                System.out.println(" оператор switch: ");
                System.out.println(" switch ( выражение ) { ");
                System.out.println("    case константа: ");
                System.out.println("        последовательность операторов; ");
                System.out.println("    //....");
                System.out.println(" } ");
                break;
            case '3':
                System.out.println(" Оператор while: ");
                System.out.println(" while ( условие ) { оператор; } ");
                break;
            case '4':
                System.out.println(" Оператор do-while: ");
                System.out.println(" do { ");
                System.out.println("    оператор; ");
                System.out.println(" } while ( условие ) ");
                break;
            case '5':
                System.out.println(" Оператор for: ");
                System.out.println(" for ( инициализация; условие; итерация; ) { ");
                System.out.println("    оператор; } ");
        }
    }
}
/*
 Краткая справка по:
 1.if
 2.switch
 3.while
 4.do-while
 5.for
 Выбирите вариант:
5

 Оператор for:
 for ( инициализация; условие; итерация; ) {
    оператор; }
 */