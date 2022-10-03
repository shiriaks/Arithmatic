import javax.swing.*;
import java.util.Scanner;

public class Arithmatic {

    public int add(int a, int b)
    {
        return (a+b);
    }

    public int sub(int a, int b)
    {
        return (a-b);
    }
    public int mul(int a, int b)
    {
        return (a*b);
    }
    public int div(int a, int b)
    {
        return (a/b);
    }
    public int rem(int a, int b)
    {
        return (a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmatic obj = new Arithmatic();

        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition = "+ obj.add(num1, num2));
        System.out.println("Subtraction = "+ obj.sub(num1,num2));
        System.out.println("Multiplication = "+ obj.mul(num1,num2));
        System.out.println("Division = "+ obj.div(num1,num2));
        System.out.println("Remainder = "+ obj.rem(num1,num2));

    }
}
