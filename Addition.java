import java.util.Scanner;
public class Addition {
    public static void main(String[] args)
    {
// initializing variables
      int sum = 0;
    Scanner scan = new Scanner(System.in);
// Getting input of two numbers
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        
// adding num1 and num2
        sum = num1 + num2;
        
// Displaying the output
        System.out.println("Sum = " + sum);
        
}
}