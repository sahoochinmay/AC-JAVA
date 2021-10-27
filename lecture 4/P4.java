import java.util.*;
public class P4{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime:");
        int num = sc.nextInt();
        int half = num / 2;
        int flag = 0;
        if(num == 0 || num == 1)
        {
            System.out.println(num +" is not a prime number");
        }else{
            for(int i = 2; i <= half;i++)
            {
                if(num % i == 0)
                {
                    System.out.println(num + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
        {
            System.out.println(num+" is a prime number");
        }
    }
}