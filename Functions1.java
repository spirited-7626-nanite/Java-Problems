import java.util.Scanner;


//Functions are directly called and and they are termed as methods when they are called with the help of object of any class
class Function{
// Function to add 2 numbers
    // static int Addition(int a, int b){
    //     int sum = a+b;
    //     System.out.println(sum);
    //     return sum;
    // }

// Factorial of a number : 
    static int factorial(int num){
    int factorial = 1;

    if (num == 0){
        factorial = 1;
    } else {
        for(int i = num; i >= 1; i--){
            factorial = factorial * i;
        }
    }

    System.out.println("The factorial of your number is " + factorial);
    return factorial;
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first Number : ");
        // int A = sc.nextInt();
        // System.out.println("Enter second Number : ");
        // int B = sc.nextInt();
        // System.out.println("The summation of these two numbers is : ");

        // Addition(A, B);


        System.out.println("Enter a number to get the factorial : ");
        int C = sc.nextInt();

        factorial(C);

        sc.close();



    }
}