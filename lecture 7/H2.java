import java.util.*;
public class H2{
    public static void checkEvenOrOdd(int a)
    {
        if(a % 2 == 0)
        {
            System.out.println(a+" is an even number");
        }else{
            System.out.println(a+" is an odd number");
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        checkEvenOrOdd(num);
    }
}