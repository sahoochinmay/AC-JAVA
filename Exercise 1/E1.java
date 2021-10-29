import java.util.*;
public class E1{
    public static void average(int n1,int n2, int n3)
    {
        int avg = (n1 + n2 + n3) / 3;
        System.out.println("Average:"+avg);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        average(n1,n2,n3);
    }
}