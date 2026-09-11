// Advance problem 4: 

// Palindromic Pyramid : 
/* print:
        1
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5 
 

*/
import java.util.Scanner;

class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            int spaces = n-i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }


            System.out.println();
        }

        
    }
}