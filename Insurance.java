import java.util.Scanner;

public class Insurance {
    Scanner sc = new Scanner(System.in);

    public void Ins()
    {
        System.out.println("Are You Married ?(true/false) ");
        boolean married = sc.nextBoolean();
        if (married == true)
        {
            System.out.println("You are eligible for Insurance");
        }
        else
        {
            System.out.println("What is your Age ?");
            int age = sc.nextInt();
            System.out.println("Are you male ? (true/false)");
            boolean male = sc.nextBoolean();
            if ((age>30) && (male == true))
            {
                System.out.println("You are eligible for Insurance");
            }
            else if ((age>25) && (male == false))
            {
                System.out.println("You are eligible for Insurance");
            }
            else
            {
                System.out.println("Not eligible for Insurance");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Insurance obj = new Insurance();

        obj.Ins();
    }
}
