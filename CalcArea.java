import java.util.Scanner;

public class CalcArea {

    Scanner sc = new Scanner(System.in);
    double PI = 3.14;
    public void circle()
    {
        System.out.println("Enter radius: ");
        double radius = sc.nextInt();
        double res = PI*(radius*radius);
        System.out.println("Area of circle is: "+res);
    }
    public void square()
    {
        System.out.println("Enter side of square: ");
        int side = sc.nextInt();
        int res = (side*side);
        System.out.println("Area of square is: "+res);
    }
    public void triangle()
    {
        System.out.println("Enter sides of triangle: ");
        System.out.println("Enter Base: ");
        double base = sc.nextDouble();

        System.out.println("Enter Height: ");
        double height = sc.nextDouble();
        double res = (0.5*base*height);

        System.out.println("Area of Triangle is: "+res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcArea obj = new CalcArea();

        obj.circle();
        obj.square();
        obj.triangle();
    }
}
