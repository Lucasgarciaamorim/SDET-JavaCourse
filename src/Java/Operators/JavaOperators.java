package Java.Operators;

public class JavaOperators {
    public static void main(String[] args) {

        int i = 10;
        int i2 = -10;
        int i3 = ++i;
        int i4 = i++;
        int i5 = --i;
        int i6 = i--;

        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("i5 = " + i5);
        System.out.println("i6 = " + i6);

        System.out.println();

        System.out.println("===== Binary Arithmetic Operators =====");

        int i7 = 10 + 1;
        int i8 = i7 - 1;
        int i9 = i8 / 2;
        int i10 = i9 % 2;
        int i11 = 5 % 10;
        int i12 = i10 * 3;

        System.out.println("i7 = " + i7);
        System.out.println("i8 = " + i8);
        System.out.println("i9 = " + i9);
        System.out.println("i10 = " + i10);
        System.out.println("i11 = " + i11);
        System.out.println("i12 = " + i12);
        System.out.println("Hello " + "World " + "!");

        System.out.println();

        System.out.println("===== Assignment Operators =====");


        int i13 = 10;
        i13 += 2;
        System.out.println(i13);

        System.out.println();

        System.out.println("===== Relational Operators =====");

        int i14 = 10;
        int i15 = 20;

        System.out.println(i14 == i15);
        System.out.println(i14 != i15);
        System.out.println(i14 > i15);
        System.out.println(i14 < i15);

        System.out.println();


        System.out.println("===== Logical Operators =====");
        // System.out.println(false & (5 / 0 == 0));
        System.out.println(false && (5 / 0 == 0));
        // System.out.println(true | (5 / 0 == 0));
        System.out.println(true || (5 / 0 == 0));
        System.out.println("!true" + !true);
        System.out.println(true ^ true);
        System.out.println(false ^ true);

        System.out.println();


        System.out.println("===== Bitwise Operators =====");
        System.out.println("4 & 5 " + (4 & 5)); //4
        /*
         *                  1 0 0
         *                  & & &
         *                  1 0 1
         *                 -------
         *                  1 0 0 = 4
         */
        System.out.println("4 | 5 " + (4 | 5));//5
        /*
         *                  1 0 0
         *                  | | |
         *                  1 0 1
         *                 -------
         *                  1 0 0 = 5
         */

        System.out.println("4 ^ 5 " + (4 | 5));//1
        /*
         *                  1 0 0
         *                  ^ ^ ^
         *                  1 0 1
         *                 -------
         *                  1 0 0 = 1
         */


    }
}
