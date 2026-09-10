/*
Inverted Half Pyramid Problem : 

Print : 
* * * * *
* * * 
* *
*  
 */

class Problem {

    public static void main(String[] args) {

        int m = 4;
        int n = 4;

        for (int i = 1; i <= m; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Another Way : ");


        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
