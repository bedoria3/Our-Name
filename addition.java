
import java.util.Scanner;
public class Addition{

    public static void main(String[] args) {
        int num1;
        int num2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            num1 = scan.nextInt();
            System.out.print("Enter second number: ");
            num2 = scan.nextInt();
        }
        int sum = num2 + num1;
        System.out.println("Output: "+sum);
    }
    
}
