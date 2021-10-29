import java.util.*;
public class E4{
    public static void circumference()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int r = sc.nextInt();
        double cir = 2 * 3.141 * r;
        System.out.println("Circumference = "+cir);
    }
    public static void main(String args[])
    {
        circumference();
    }
}