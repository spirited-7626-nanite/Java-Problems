// If-else in Java
import java.util.Scanner;

class Experiment{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter another number : ");
        int b = sc.nextInt();
        sc.nextLine();

        sc.close();

        if (a==b) {
            System.out.println("Both numbers are equal : "+a+" = "+b );
        }
        else if( a>= b){
            System.out.println(a+" > "+b);
        }
        else{
            System.out.println(a+" < "+b);
        }

    }
}