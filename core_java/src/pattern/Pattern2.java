/*
====================================================
||              H O U R G L A S S  P A T T E R N    ||
====================================================
 *****
  ***
   *
  ***
 *****
*/

package pattern;

public class Pattern2 {

    public static void main(String[] args) {

        int n = 3;
        for (int i = n; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 2; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
