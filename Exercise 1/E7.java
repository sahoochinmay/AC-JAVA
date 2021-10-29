import java.util.*;
public class E7{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int even=0;
        int odd = 0;
        int zero= 0;
        int loop = 1;
        while(loop == 1)
        {
        System.out.println("Enter a number:");
          int num = sc.nextInt();
          if(num == 0)
          {
              zero= zero + 1;
          }else if(num % 2 == 0)
          {
              even = even + 1;
          }else{
              odd = odd + 1;
          }
        System.out.println("Renter ?(Yes 1/ No 0)");
          loop = sc.nextInt();
        }
        System.out.println("Even:"+even+" times");
        System.out.println("odd:"+odd+" times"); 
        System.out.println("zero:"+zero+" times");

    }
}