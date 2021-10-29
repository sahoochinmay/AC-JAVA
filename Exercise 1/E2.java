import java.util.*;
public class E2{
    public static void printOdd(int n)
    {
        System.out.println("Odd numbers are:");
        for(int i=1;i <=n;i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i+" ");
            }
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        printOdd(n);
    }
}