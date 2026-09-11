// Advance problem 2: 

// Solid Rhombus : 
/* print:

      * * * * * 
    * * * * * 
  * * * * * 
* * * * *   


*/
import java.util.Scanner;

class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        // Spaces
        for (int i = 1; i <= n; i++) {
            int spaces = n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}