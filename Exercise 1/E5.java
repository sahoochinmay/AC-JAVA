import java.util.*;
public class E5{
    public static void checkAge()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age > 18)
        {
        System.out.println("You are eligible for voting");
        }
    }
    public static void main(String args[])
    {
        checkAge();
    }
}