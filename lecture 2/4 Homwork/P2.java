import java.util.*;

public class P2{
    public static void main(String args[])
    {
        System.out.println("Enter readius of the circle:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.141 * (r * r);
        System.out.print("Area = ");
        System.out.print(area);
    }
}