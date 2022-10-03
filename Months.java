import java.util.Scanner;

public class Months {
    Scanner sc = new Scanner(System.in);

    public void DaysToMonths()
    {
        System.out.println("Enter number of days: ");
        int dayNum = sc.nextInt();
        int days = dayNum%30;
        int months = dayNum/30;
        System.out.println(dayNum + " days is equal to " + months +" Month and "+ days+ " days");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Months obj = new Months();

        obj.DaysToMonths();
    }
}
