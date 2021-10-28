import java.util.*;
public class H1{
    public static void primeCheck(int a)
    {
        if( a == 0 || a == 1 || a < 0)
        {
            System.out.println(a+" is not a prime number");
            return;
        }
        int half = a / 2;
        for(int i=2; i <= half;i++)
        {
            if(a % i == 0)
            {
                System.out.println(a+" is not a prime number");
                return;
            }
        }
        System.out.println(a+" is a prime number");
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime:");
        int num = sc.nextInt();
        primeCheck(num);
    }
}