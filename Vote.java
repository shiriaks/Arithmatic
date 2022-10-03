import java.util.Scanner;

public class Vote {
    Scanner sc = new Scanner(System.in);

    public void voter()
    {
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18)
        {
            System.out.println("You are eligible to give vote!");
        }
        else
        {
            System.out.println("You are not eligible to give vote!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vote obj = new Vote();

        obj.voter();
    }
}
