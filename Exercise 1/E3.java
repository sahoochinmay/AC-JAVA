import java.util.*;
public class E3{
    public static void greaterNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int n1 =  sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 >= n2)
        {
            System.out.println(n1+" is greater number");
        }else{
            System.out.println(n2+" is greater number");
        }
    }
    public static void main(String args[])
    {
        greaterNumber();
    }
}