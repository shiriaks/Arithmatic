import java.util.Scanner;

public class GreaterNumber {

    Scanner sc = new Scanner(System.in);
    public void Greater()
    {
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        if (a >= b)
        {
            System.out.println(a+" is greater than"+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GreaterNumber obj = new GreaterNumber();

        obj.Greater();
    }
}
