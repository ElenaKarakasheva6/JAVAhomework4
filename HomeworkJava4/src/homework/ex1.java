/*
Дефинирайте променливи със стойност -250, 250, 4 589 498, 10 000 000 000
000 000 000, -9 000 000 000 000 000 000.
Изведете всяка променлива на екрана със println()
**/

package homework;

public class ex1 {
    public static void main(String[] args){
        short shortNum1 = -250;
        short shortNum2 = 250;
        int intNum = 4_589_498;
        float floatNum = 10_000_000_000_000_000_000f;
        long longNum = -9_000_000_000_000_000_000L;

        System.out.println(shortNum1);
        System.out.println(shortNum2);
        System.out.println(intNum);
        System.out.println(floatNum);
        System.out.println(longNum);
    }
}
