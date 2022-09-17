import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
// initializing variables
       int sum = 0, minus= 0, product= 0,quotient= 0; 
  
        Scanner scan = new Scanner(System.in);
// Getting input of two numbers
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        

 // Adding, subtracting, multiplying and dividing the 2 input numbers
        sum = num1 + num2;
        minus = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
// Displaying the output
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + minus);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
    }
}