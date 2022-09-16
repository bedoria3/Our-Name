import java.util.Scanner;

public class Subraction{
public static void main(String args[]){
  int sub;
Scanner scan=new Scanner(System.in);

System.out.print("Enter the value to num1: ");
int num1=scan.nextInt();
System.out.print("Enter the value to num2: ");
int num2=scan.nextInt();
sub=num1-num2;
System.out.print("Subtraction of "+num1+" and "+num2+" = " +sub);

}
}
