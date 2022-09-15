import java.util.Scanner;

public class SubtractTwoNum1{
public static void main(String args[]){
  int sub;
Scanner scan=new Scanner(System.in);

System.out.print("Enter the value to num1: ");
int num1=scan.nextInt();
System.out.print("Enter the value to num2: ");
int num2=scan.nextInt();
sub=num2-num1;
System.out.print("subtraction of "+num2+"-"+num1+" :"+sub);

}
}