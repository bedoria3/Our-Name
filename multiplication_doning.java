
package multiplication_doning;
import java.util.Scanner;

public class Multiplication_doning {

    
    public static void main(String[] args) {
        int num1;
        int num2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            num1 = scan.nextInt();
            System.out.print("Enter second number: ");
            num2 = scan.nextInt();
        }
        int product = num1*num2;
        System.out.println("Output: "+product);
    }
    
}

