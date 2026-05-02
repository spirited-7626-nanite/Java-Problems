// Switch and Break in Java

import java.util.Scanner;

class Experiment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lucky number from 1 to 8 : ");
        int button = sc.nextInt();
        sc.nextLine();

        sc.close();

        switch (button) {
            case 1:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("The only number that is neither prime nor composite.");
                break;

            case 2:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("The Smallest and only Even prime number");
                break;

            case 3:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("The first odd prime and forms the simplest polygon (triangle).");
                break;

            case 4:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("The smallest composite number and a perfect square (2²).");
                break;

            case 5:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("The only prime number that ends in 5.");
                break;

            case 6:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("The smallest perfect number (sum of its factors equals itself: 1+2+3=6).");
                break;

            case 7:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("A prime number often considered lucky and widely used in culture and science.");
                break;

            case 8:
                System.out.println("Oh your lucky number is : "+button);
                System.out.println("You know what! your number is ");
                System.out.println("A perfect cube (2³) and represents infinity when turned sideways (∞).");
                break;

            default:
                System.out.println("Invalid Number");
                ;
        }
    }
}
