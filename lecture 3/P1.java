import java.util.*;

public class P1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("select operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
        int operation = sc.nextInt();
        int result = 0;
        switch(operation){
            case 1:
             result = a + b;
             break;
            case 2:
                result = a - b;
            break;
            case 3 : 
                result = a * b;
            break;
            case 4:
                result = a / b;
             break;
             case 5 : 
             result  = a % b;
             break;
            default:
            System.out.println("Unidentify input");
        }
            System.out.print("Result = ");
            System.out.print(result);
    }
}