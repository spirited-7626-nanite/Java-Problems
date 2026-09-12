// Practice Questions : 
class Practice {

// Ques.1 : Enter 3 numbers from the user & make a function to print their average.    
int Average(int a, int b, int c ){
int avg = (a+b+c)/3;
System.out.println("The Average is : "+avg);
return avg;
}

// Ques.2 : Write a function to print the sum of all odd numbers from 1 to n.
int oddSum(int n){
int sum = 0;
for (int i=0; i<=n;i++){
    if(i%2 !=0){
        sum += i;
    }
}
System.out.println("The sum of odd numbers is : "+sum);
return sum;
}

// Ques.3 Write a function which takes in 2 numbers and returns the greater of those two.
void greater(int a, int b){
    if (a>b){
        System.out.println(a+" is greater than "+b);
    }
    else if(a==b){
        System.out.println("Both numbers are equal");
    }
    else {
        System.out.println(b+" is greater than "+a);
    }
}

// Ques.4 Write a function that takes in the radius as input and returns the circumference of a circle.
double Circumference(double rad){
 double circum = 2*(rad*3.14);
 System.out.println("The circumference is : "+circum);
 return circum;
}

// Ques.5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.




    public static void main(String[] args) {
        
    }
}