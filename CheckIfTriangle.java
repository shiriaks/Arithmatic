import java.util.Scanner;

public class CheckIfTriangle {
    Scanner sc = new Scanner(System.in);
    public void Triangle()
    {
        System.out.println("Enter angle of triangle ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a ==0 || b == 0 || c==0)
        {
            System.out.println("Not a valid Triangle");
        }
        else
        {
            if(a+b+c == 180 )
            {
                System.out.println("It is a valid Triangle");
            }
            else
            {
                System.out.println("not a valid triangle");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckIfTriangle obj = new CheckIfTriangle();

        obj.Triangle();
    }
}
