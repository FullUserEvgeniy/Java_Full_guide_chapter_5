// Части цикла for могут быть пустыми
public class ForVar {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;
        for ( ; !done; ){
            System.out.println(" i равно " + i);
            if (i == 10) done = true;
            i ++;
        }
    }
}
/*
 i равно 0
 i равно 1
 i равно 2
 i равно 3
 i равно 4
 i равно 5
 i равно 6
 i равно 7
 i равно 8
 i равно 9
 i равно 10
 */